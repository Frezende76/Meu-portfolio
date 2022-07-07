function password_show_hide(){
    var senha = document.getElementById("password");
    var show_eye = document.getElementById("show_eye");
    var hide_eye = document.getElementById("hide_eye");
    hide_eye.classList.remove("d-none");
    if  (senha.type === "password"){
        senha.type = "text";
        show_eye.style.display = 'none';
        hide_eye.style.display = 'block';
    }else{
        senha.type = "password";
        show_eye.style.display = 'block';
        hide_eye.style.display = 'none';
    }
}