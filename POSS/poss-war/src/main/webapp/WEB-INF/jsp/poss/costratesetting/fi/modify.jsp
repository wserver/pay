<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<script type="text/javascript" src="${ctx}/js/common.js"></script>

<head>
<title>成本费率配置</title>
<script type="text/javascript" src="${ctx}/js/common.js"></script>

<script type="text/javascript">
	var chkPolicyRst="";
	
	function processBack(){
		//window.location.href='${ctx}/report/costRateSetting.do';
		window.history.back(); 
	}
	
	function validateDate(){
		var sDate = document.getElementById("startDate").innerHTML;
		var eDate = document.getElementById("endDate").value;
		sDate=sDate.substr(0,10);
		//alert("["+sDate+"]");
		if(eDate==""){
			alert("停用日期不能为空");
			document.getElementById("endDate").focus();
			return false;
		}
		if(sDate > eDate){
			alert("停用日期必须不早于启用日期");
			document.getElementById("endDate").focus();
			return false;
		}
		return true;
	}
	
	function cfm(){
		if(confirm("确定要保存当前的修改么？")){
			if(validateDate()){
				checkPolicy();
				//alert("["+chkPolicyRst + ":"+ chkPolicyRst.length + "]");
				if(""!=chkPolicyRst.replace(/\r\n/g,"")){
					alert("无法保存！当前入款银行渠道的费率配置与以下已有配置存在冲突：\n"+chkPolicyRst);	
				}else{
					form1.submit();
				}
			}
		}	
	}
	
	function checkPolicy()
	{
		var pars = "";
		$.ajax({
			type: "POST",
			url: "${ctx}/report/costRateSetting.do?method=checkPolicy&id=${calPolicy.id}&channelNo=${calPolicy.channelNo}"
					+"&startDate="+document.getElementById("startDate").innerHTML
					+"&endDate="+document.getElementById("endDate").value
					+"&fifoChannel=${calPolicy.fifoChannel}",
			data: pars,
			async:false,
			success: function(result) {
				chkPolicyRst=result;
			}
		});
	}		
</script>
</head>

<body>
	<table width="320" border="0" cellspacing="0" cellpadding="0" align="center" height="21">
			<tr>
				<td height="1" bgcolor="#000000"/>
			</tr>
			<tr>
				<td height="18">
					<div align="center">
						<font class="titletext">入款银行成本费率配置 — 修改</font>
					</div>
				</td>
			</tr>
			<tr>
				<td height="1" bgcolor="#000000"/>
			</tr>
	</table>
	<br>

	<form id="form1" name="form1" action="${ctx}/report/costRateSetting.do?method=update" method="post">
	  <input type="hidden" name="id" value="${calPolicy.id}"/>
	  <table id="policyTable" border="0" cellpadding="5" cellspacing="0" width="66%">
	    <tr>
	    	<td align="right">银行渠道名称：</td>
	    	<td align="left">
		    	<c:forEach items="${pciList}" var="pci">
		    		${pci.id == calPolicy.channelNo ? pci.description : ""}
		    	</c:forEach>
	    	</td>
	    	<td align="right">借贷类型：</td>    	
	    	<td align="left">
		    	${calPolicy.crDrCard == 0 ? "全部" : ""}
		   		${calPolicy.crDrCard == 1 ? "借记卡" : ""}
				${calPolicy.crDrCard == 2 ? "贷记卡" : ""}
	    	</td>
		</tr>
		<tr>
	      	<td align="right">费率配置类型：</td>
	      	<td align="left">
		    	${calPolicy.policyType == 1 ? "固定费用" : ""}
				${calPolicy.policyType == 2 ? "费率" : ""}
				${calPolicy.policyType == 3 ? "费率及下限" : ""}
				${calPolicy.policyType == 4 ? "费率及上限" : ""}
				${calPolicy.policyType == 5 ? "费率及上下限" : ""}
				${calPolicy.policyType == 6 ? "固定费用_费率" : ""}
				${calPolicy.policyType == 7 ? "固定费用_费率及下限" : ""}
				${calPolicy.policyType == 8 ? "固定费用_费率及上限" : ""}
				${calPolicy.policyType == 9 ? "固定费用_费率及上下限" : ""}							
	      	</td>
	      	<td align="right">计算方式：</td>
	      	<td align="left">
		   		${calPolicy.countType == 1 ? "单笔交易" : ""}
				${calPolicy.countType == 2 ? "按月累计流量" : ""}
				${calPolicy.countType == 3 ? "按年累计流量" : ""}
				${calPolicy.countType == 4 ? "按季度累计流量" : ""}	
	      	</td>
	    </tr>
		<tr>
	      	<td align="right">启用日期：</td>
	      	<td align="left"  name="startDate" id="startDate">
		      	<fmt:formatDate value="${calPolicy.startDate}" type="date" pattern="yyyy-MM-dd"/>
	      	</td>
	      	<td align="right">停用日期：</td>
	      	<td align="left">
				<input class="Wdate" type="text" id="endDate" name="endDate"  value='<fmt:formatDate value="${calPolicy.endDate}" type="date"/>' onclick="WdatePicker()" />
	      	</td>
	    </tr>	    
	  </table>
	  <br>
      <table id="policyItemTable" class="tablesorter" border="0" cellpadding="0" cellspacing="1">	   
		<thead>
		   <tr class="tabT">
			    <th class="tabTitle" align="center" scope="col">固定费用（元）</th>
			    <th class="tabTitle" align="center" scope="col">费率（十万分之一）</th>
			    <th class="tabTitle" align="center" scope="col">起始金额（元）</th>
			    <th class="tabTitle" align="center" scope="col">终止金额（元）</th>
			    <th class="tabTitle" align="center" scope="col">下限（元）</th>
			    <th class="tabTitle" align="center" scope="col">上限（元）</th>
		  </tr>
		</thead> 
		<tbody>
		  <c:forEach items="${calPolicyItems}" var="dto">
			  <tr>
			    <td align="right">&nbsp;
			    	<fmt:formatNumber value="${dto.fixAmount == null ? '' : dto.fixAmount / 1000}"  type="currency" />
			    </td>
			    <td align="right">&nbsp;
					${dto.rateAmount}
			    </td>
			    <td align="right">&nbsp;
			    	<fmt:formatNumber value="${dto.startAmount == null ? '' : dto.startAmount / 1000}"  type="currency" />
			    </td>
			    <td align="right">&nbsp;
			    	<fmt:formatNumber value="${dto.endAmount == null ? '' : dto.endAmount / 1000}"  type="currency" />
			    </td>
			    <td align="right">&nbsp;
			    	<fmt:formatNumber value="${dto.minCharge == null ? '' : dto.minCharge / 1000}"  type="currency" />
			    </td>			    			    
			    <td align="right">&nbsp;
			    	<fmt:formatNumber value="${dto.maxCharge == null ? '' : dto.maxCharge / 1000}"  type="currency" />
			    </td>
			  </tr>
		  </c:forEach>
		</tbody>
	  </table>			         
 	  <br>
	  <br>
	  <input type="button" onclick="cfm()" name="Submit1" value=" 保 存 ">&nbsp;&nbsp;&nbsp;
	  <input type="button" onclick="processBack()" name="Submit2" value=" 返 回 ">
	</form>
</body>
