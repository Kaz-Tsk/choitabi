<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="ja">
<head>
<link rel="stylesheet" type="text/css" href="css/cart_check.css">
<meta charset="UTF-8">

<!-- 国際化 ※ここでは国を判別しています。
    言語コード( ja,en など)を示すロケールID を取得します。-->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.choitabi.property.pay_check"
	var="lang" />

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><s:text name="lang.pay_check.title" /></title>
<script type="text/javascript" src="./js/cart_check.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
  <div id="pagecover">
    <header>
      <s:include value="header.jsp"></s:include>
    </header>

    <div class="mainbox">
      <h4 style="text-decoration: underline;">
        <s:text name="lang.pay_check.text" />
        &nbsp;
        <s:text name="lang.pay_check.text2" />
      </h4>
      <br>
      <div class="container-fluid">
        <div class="table-responsive">
          <h2>
            <s:text name="lang.pay_check.Itemsinabasket" />
          </h2>
          <table class="table table borderd">
            <tr>
              <th class="col-md-5"><s:text
                  name="lang.pay_check.tour" /></th>
              <th class="col-md-2"><s:text
                  name="lang.pay_check.price" /></th>
              <th class="col-md-2"><s:text
                  name="lang.pay_check.quantity" /></th>
              <th class="col-md-3"><s:text
                  name="lang.pay_check.subtotal" /></th>
            </tr>

            <s:iterator value="cartList">
              <tr>
                <td class="col-md-5"><s:property value="item_name" /></td>
                <td class="col-md-2">&yen;<script
                    type="text/javascript">
                                  decimal_floor(<s:property value="price" />);
                                </script></td>
                <td class="col-md-2"><s:property
                    value="order_count" /></td>
                <td class="col-md-3">&yen;<script
                    type="text/javascript">
                                  multiply(<s:property value="price" />,
                                      <s:property value="order_count" />);
                                </script></td>
              </tr>
            </s:iterator>
          </table>

          <h2>
            <s:text name="lang.pay_check.breakdown" />
          </h2>
          <table class="table">
            <tr>
              <th class="col-md-9"><s:text
                  name="lang.pay_check.Producttotal" /></th>
              <td class="col-md-3">&yen;<script
                  type="text/javascript">
                              decimal_floor(<s:property value="total" />);
                            </script></td>
            </tr>

            <tr>
              <th class="col-md-9"><s:text
                  name="lang.pay_check.Shippingtaxexclusion" /></th>
              <td class="col-md-3">&yen;<s:text
                  name="constant.postage" /></td>
            </tr>

            <tr>
              <th class="col-md-9"><s:text
                  name="lang.pay_check.subtotal" /></th>
              <td class="col-md-3">&yen;<script
                  type="text/javascript">
                              add(<s:property value="total" />,
                                  <s:text name="constant.postage"/>);
                            </script></td>
            </tr>

            <tr>
              <th class="col-md-9"><s:text
                  name="lang.pay_check.consumptiontax" /></th>
              <td class="col-md-3">&yen;<script
                  type="text/javascript">
                              cal_tax(<s:text name="constant.rate"/>);
                            </script></td>
            </tr>

            <tr>
              <th class="col-md-9"><s:text
                  name="lang.pay_check.ordertotal" /></th>
              <td class="col-md-3">&yen;<script
                  type="text/javascript">
                              cal_total();
                            </script></td>
            </tr>

            <tr class="ordertotal">
              <th class="col-md-9"><s:text
                  name="lang.pay_check.Totalpayment" /></th>
              <td class="col-md-3" style="font-weight: bold;">&yen;<script
                  type="text/javascript">
                            </script></td>
            </tr>

          </table>

          <h2>
            <s:text name="lang.pay_check.methodofpayment" />
          </h2>
          <table class="table table borderd">
            <tr>
              <th class="col-md-4"><s:text
                  name="lang.pay_check.methodofpayment" /></th>
              <td class="col-md-8"><s:text
                  name="lang.pay_check.credit" /><br></td>
            </tr>
          </table>

          <h2>
            <s:text name="lang.pay_check.addressee" />
          </h2>
          <s:iterator value="userList">
            <table class="table table borderd">
              <tr>
                <th class="col-md-4"><s:text
                    name="lang.pay_check.name" /></th>
                <td class="col-md-8"><s:property value="name" /></td>
              </tr>
              <tr>
                <th class="col-md-4"><s:text
                    name="lang.pay_check.adress" /></th>
                <td class="col-md-8">〒<script
                    type="text/javascript">
                                  postal_hyphen(<s:property value="postal" />)
                                </script>
                  <br>
                <s:property value="address" /></td>
              </tr>
              <tr>
                <th class="col-md-4"><s:text
                    name="lang.pay_check.phonenumber" /></th>
                <td class="col-md-8"><s:property
                    value="phoneNumber" /></td>
              </tr>
              <tr>
                <th class="col-md-4"><s:text
                    name="lang.pay_check.phone" /></th>
                <td class="col-md-8"><s:property value="phoneemail" /></td>
              </tr>
            </table>
          </s:iterator>

        </div>
      </div>
    </div>
    <br>
    <div class="orderbuttom">
      <a href="GoPaymentAction" class="backlink"><s:text
          name="lang.pay_check.text3" /></a> <a
        href="<s:url action="GoCartDoneAction"><s:param name="use_point" value="%{use_point}" /><s:param name="get_point" value="%{get_point}" /></s:url>"
        class="nextlink"><s:text name="lang.pay_check.text4" /></a>
    </div>
  </div>
 <footer style="text-align:center;">
		<c:import url="http://www.internousdev.com/openconnect/footer.jsp" />
	</footer>

</body>
</html>
