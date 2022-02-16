$(document).ready(function () {
    $("#sector1").click(function () {
        $("#sector1").addClass("displaying");
        $("#sector2").removeClass("displaying");
        $("#capacity").addClass("hide");
        $("#already").removeClass("hide");
    });

    $("#sector2").click(function () {
        $("#sector2").addClass("displaying");
        $("#sector1").removeClass("displaying");
        $("#capacity").removeClass("hide");
        $("#already").addClass("hide");
    });
});