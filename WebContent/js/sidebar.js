$(function(){

    $("ul.menu").hide();
    $("div.category").click(function(){
        $("ul.menu").slideUp();
            if($("+ul",this).css("display")=="none"){
            $("+ul",this).slideDown();
            }
    });
});