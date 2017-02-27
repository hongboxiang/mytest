var team = "11-ICM配置";
var reason = "FAILED_TYPE_1";

var first = document.getElementById("ids");
var tr = first.parentNode.parentNode;
var next = true;
while(next){
    if(tr.nextElementSibling) {
        next = true
    }else{
        next = false
    }
    var child = tr.childNodes;
    var icm = child[11].innerText;
    if(icm == team){
        child[1].firstElementChild.checked  = true;
    }
    tr = tr.nextElementSibling;
}

$("#allfailedType").val(reason);
$("#allfailedResult").attr("value",'物理环境问题');//填充内容
$(':button').click();