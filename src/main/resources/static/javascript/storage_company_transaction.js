$(document).ready(function () {
    let $sector1 = $("#sector1"), $sector2 = $("#sector2"), $sector3 = $("#sector3");
    let $info1 = $("#info1"), $info2 = $("#info2"), $info3 = $("#info3");
    $sector1.click(function () {
        $sector1.addClass("displaying");
        $sector2.removeClass("displaying");
        $sector3.removeClass("displaying");
        $info1.removeClass("hide");
        $info2.addClass("hide");
        $info3.addClass("hide");
    });

    $sector2.click(function () {
        $sector2.addClass("displaying");
        $sector1.removeClass("displaying");
        $sector3.removeClass("displaying");
        $info2.removeClass("hide");
        $info1.addClass("hide");
        $info3.addClass("hide");
    });

    $sector3.click(function () {
        $sector3.addClass("displaying");
        $sector1.removeClass("displaying");
        $sector2.removeClass("displaying");
        $info3.removeClass("hide");
        $info1.addClass("hide");
        $info2.addClass("hide");
    });
});