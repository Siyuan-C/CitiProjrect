$(document).ready(function () {
    let $use_password = $("#use-password");
    let $password = $("#password");
    let $scan_RQ_code = $("#scan-RQ-code");
    let $RQ_code = $("#RQ-code");
    $use_password.on("click", function () {
        $scan_RQ_code.removeClass("condition-active");
        $use_password.addClass("condition-active");
        $RQ_code.removeClass("login-content-active")
        $password.addClass("login-content-active");
    });
    $scan_RQ_code.on("click", function () {
        $use_password.removeClass("condition-active");
        $scan_RQ_code.addClass("condition-active");
        $password.removeClass("login-content-active")
        $RQ_code.addClass("login-content-active");
    })
});