<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/common/taglibs.jsp"%>
<table width="25%" border="0" cellspacing="0" cellpadding="0"
	align="center" height="21" style="">
	<tr>
		<td height="1" bgcolor="#000000"></td>
	</tr>
	<tr>
		<td height="18">
		<div align="center"><font class="titletext">查询出款银行</font></div>
		</td>
	</tr>
	<tr>
		<td height="1" bgcolor="#000000"></td>
	</tr>
</table>
 <form action="" method="post" id="mainfromId">
		<table class="border_all2" width="80%" border="0" cellspacing="0"
			cellpadding="1" align="center">	
		    <tr class="trForContent1">
		      <td align="right" class="border_top_right4" >出款银行：</td>
		      <td class="border_top_right4">
		      	<li:codetable fieldName="bankId" style="select" attachOption="true" codeTableId="fundOutBankTable"></li:codetable>
		      </td>
		     </tr>
		     <tr class="trForContent1">
			      <td class=border_top_right4 align="right" >状态：</td>
			      <td class="border_top_right4" >
			      	<li:select name="status" selected="${dto.status}" itemList="${statusList}"  />
			      </td>
			 </tr>
		    <tr class="trForContent1">
		      <td align="center" class="border_top_right4" colspan="2">
		      <input style="width: 100px;" type="button" value="添加渠道" id="btn_add" onClick="add()"/>
		      <input type="button"  name="butSubmit" value="查  询" class="button2" onclick="search();">
		      </td>
		    </tr>
	   </table>
	
 </form>
 
<div id="resultListDiv" class="listFence"></div>

  <div id="infoLoadingDiv" title="加载信息" style="display: none; width: 200px; padding-top: 30px; height: 70px;">
	<img src="${ctx}/images/page/blue-loading.gif" />&nbsp;&nbsp;信息加载中, 请稍候...
	</div>    
  <script type="text/javascript">
	
	$(document).ready(function(){
		search();
	}); 
	
	function search(pageNo,totalCount,pageSize) {
		$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize()+ "&pageNo=" + pageNo + "&totalCount=" + totalCount+"&pageSize=" + pageSize;
		;
			$.ajax({
				type: "POST",
				url: "context_fundout_fobank.controller.htm?method=search",
				data: pars,
				success: function(result) {
					$('#infoLoadingDiv').dialog('close');
					$('#resultListDiv').html(result);
				}
			});
	}

	function add(){
		window.location.href='${ctx}/context_fundout_fobank.controller.htm';
	}
	
  </script>