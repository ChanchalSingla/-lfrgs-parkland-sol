/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

/*
 * This function gets loaded when all the HTML, not including the portlets, is
 * loaded.
 */
AUI().ready(function () {
  // header menu - start
  if ($(window).width() <= 1024) {
    $(".kabab").on("click tap", function () {
      $(this).toggleClass("open");
      $("header").toggleClass("active");
      $("header .menu-wrap").toggleClass("open");
      $("header .menu-wrap .nav-wrap").toggleClass("active");
      $("body").toggleClass("bodyOverflowHidden");
      $(".overlay-body").toggleClass("active");
    });
    $(".overlay-body").on("click tap", function () {
      $(this).removeClass("active");
      $("header, .menu-wrap .nav-wrap").removeClass("active");
      $("body").removeClass("bodyOverflowHidden");
      $(".kabab, header .menu-wrap").removeClass("open");
    });

    // mega menu accordion
    var smLink = $("header .mega-menu .mega-wrap .col p");
    smLink.click(function (i) {
      i.preventDefault();
      var submenu = $(this).closest(".mega-wrap .col").find(".submenu");
      $(this).closest(".mega-wrap").find(".submenu").not(submenu).slideUp();
      if ($(this).hasClass("active")) {
        $(this).removeClass("active");
      } else {
        smLink.removeClass("active");
        $(this)
          .closest(".mega-wrap")
          .find(".mega-wrap .col p.active")
          .removeClass("active");
        $(this).addClass("active");
      }
      submenu.stop(false, true).slideToggle();
    });
  }

  // Header Promotions Jquery
  $("header .container-v1 .inner-wrap .menu-wrap .nav-wrap .nav .link:last-child").addClass("font-roboto font-italic");
  $("header .container-v1 .inner-wrap .menu-wrap .nav-wrap .nav .link:last-child a").append('<span class="blink">Offers</span>');

  // search bar
  $(".search-toggle").on("click", function (e) {
    var selector = $(this).data("selector");
    $(selector).toggleClass("show").find(".search-input").focus();
    $(this).toggleClass("active");
    e.preventDefault();
  });

  $("#search_typed").focus(function () {
    $(this).val("");
  });

  // language
  $("header ul.lang").on("click", ".init", function () {
    $(this).closest("header ul.lang").children("li:not(.init)").toggle();
  });

  /* to change pagination PLP page text */
  $(".product-card-item .pagination-bar ul.pagination li:first-child a").text('Previous');
  $(".product-card-item .pagination-bar ul.pagination li:last-child a").text('Next');
  if($(".product-card-item .pagination-bar ul.pagination li").length <= 3){
    $(".product-card-item .pagination-bar ul.pagination li.page-item.active").addClass('noActive');
  }else{
    $(".product-card-item .pagination-bar ul.pagination li.page-item:nth-last-child(2)").addClass('noActive');
  };

  // Similar product slider
  $('.product-gallery-main .product-card-tiles').slick({
    slidesToShow: 4,
    slidesToScroll: 4,
    arrows: true,
    prevArrow: "<button type='button' class='slick-prev'><img src='/o/product-list-renderer/images/gallery-arrow.svg'></button>",
    nextArrow: "<button type='button' class='slick-next'><img src='/o/product-list-renderer/images/gallery-arrow.svg'></button>",
    dots: true,
    draggable: false,
    infinite: false,
    speed: 1000,
    responsive: [{
        breakpoint: 1100,
        settings: {
            slidesToShow: 3,
        }
    },
    {
        breakpoint: 992,
        settings: {
            slidesToShow: 2,
            slidesToScroll: 2,
            arrows: true,
        }
    }
    ]
  });
});

/*
 * This function gets loaded after each and every portlet on the page.
 *
 * portletId: the current portlet's id
 * node: the Alloy Node object of the current portlet
 */
Liferay.Portlet.ready(function (_portletId, _node) { });

/*
 * This function gets loaded when everything, including the portlets, is on
 * the page.
 */
Liferay.on('allPortletsReady', function () { });

function copyToClipboard(element) {
  var $temp = $('<input>');
  $("body").append($temp);
  $temp.val($(element).text()).select();
  document.execCommand("copy");
  $temp.remove();
  $(".popup-wrap .copyproductcode").fadeIn(500);
  setTimeout(function () {
      $(".popup-wrap .copyproductcode").fadeOut(300);
  }, 1200);
};

// Added from Cart
$(".prod-btn .btn-add-to-cart").click(function () {
  $(".popup-wrap .premovecart").fadeOut(100);
  $(".popup-wrap .paddcart").fadeIn(500);
  setTimeout(function () {
      $(".popup-wrap .paddcart").fadeOut(300);
  }, 1200);
});


