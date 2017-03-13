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
        if(child[1].firstElementChild.checked == false){
            if(child[19].childNodes[0].selectedOptions[0].innerText == "--请选择--"){
                child[1].firstElementChild.checked  = true;
            }
        }
    }
    tr = tr.nextElementSibling;
}


$("#allfailedType").val(reason);
$("#allfailedResult").attr("value",'环境问题');//填充内容
$(':button').click();