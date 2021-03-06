<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/common/taglibs.jsp"%>
<h2 class='panel_title'>融资订单查询</h2>
<form action="" method="post" id="mainfromId">
	<table class="border_all2" width="80%" border="0" cellspacing="0"
		cellpadding="1" align="center">	
	    <tr class="trForContent1" >
	      <td align="right" class="border_top_right4">授信流水号：</td>
	      <td class="border_top_right4">
	      	<input type="text" id="creditId" name="creditId">
	      </td>
	     	<td align="right" class="border_top_right4" width="200">申请时间：</td>
					<td class="border_top_right4" colspan="6" width="200" align="left">
						<input class="Wdate" type="text" id="startTime" name="startTime"
						value='<fmt:formatDate value="${startTime}" type="both"/>'
						style="width: 150px;"
						onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'startTime\',{d:0});}'});">
						至
						<input class="Wdate" type="text" id="endTime" name="endTime"
						value='<fmt:formatDate value="${endTime}" type="both"/>'
						style="width: 150px;"
						onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'endTime\',{d:0});}'});">
			</td>
	     </tr>
	    <tr class="trForContent1" >
	      <td align="right" class="border_top_right4">会员号：</td>
	      <td class="border_top_right4">
	      		<input type="text" name="partnerId" id="partnerId" />
	      </td>
	      <td align="right" class="border_top_right4" >商户名称：</td>
	      <td class="border_top_right4">
		    	<input type="text" name="partnerName" id="partnerName" />
	      </td>
	     </tr>
	    <tr class="trForContent1" >
	      <td align="right" class="border_top_right4">授信方式：</td>
	      <td class="border_top_right4">
	      		<select name="creditType" id="creditType">
	      			<option value="">全部</option>
	      			<option value="A">订单授依信</option>
	      		</select>
	      </td>
	      <td class="border_top_right4" colspan="2"></td>
	     </tr>
	    <tr class="trForContent1">
	      <td align="center" class="border_top_right4" colspan="6">
	      <input type="button" onclick="search()"  name="butSubmit" value="查  询" class="button2">
	      </td>
	    </tr>
   </table>
</form>
<div id="resultListDiv" class="listFence"></div>
<div id="infoLoadingDiv" title="加载信息"
	style="display: none; width: 200px; padding-top: 30px; height: 70px;">
	<img src="${ctx}/images/page/blue-loading.gif" />&nbsp;&nbsp;信息加载中,
	请稍候...
</div>
<script type="text/javascript">
	$(document).ready(function() {
		search();
	});

	function search(pageNo, totalCount) {
		//$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize() + "&pageNo=" + pageNo
				+ "&totalCount=" + totalCount;
		$.ajax({
			type : "POST",
			url : "./orderCredit.do?method=orderCreditQuery",
			data : pars,
			success : function(result) {
				$('#resultListDiv').html(result);
			}
		});
		
	}
</script>


