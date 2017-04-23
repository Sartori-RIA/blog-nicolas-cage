$(document).ready(function () {	

    $('.collapsible').collapsible();

    $('#year').html(getCurrentYear());

    $('select').material_select();

    $(".button-collapse").sideNav();

    $('input#title, textarea#content').characterCounter();

    $("#formValidate").validate({
        rules: {
            title: {
                required: true,
                minlength: 5
            },
            content: {
                required: true,
                minlength: 5
            },
            username: {
                required: true
            },
            password: {

            }
        },
        messages: {
            title: {
                required: "Insira um título adorando Nicolas Cage senhor de todo o universo",
                minlength: "Deve conter no mínimo 5 digitos"
            },
            content: {
                required: "Insira algum conteúdo para a sua adoração a Nicolas Cage senhor de todo o universo",
                minlength: "Deve conter no mínimo 5 digitos"
            },
            username: {
                required: "Precisamos saber seu nome de usuario"
            },
            password: {
                required: "Todo login precisa de uma senha.... obviamente"
            }
        }
    });

});

function getCurrentYear(){
    return new Date().getFullYear();    
}

new WOW().init();
