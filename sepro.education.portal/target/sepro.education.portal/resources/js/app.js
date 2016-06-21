$(function() {
	$('#side-menu').metisMenu();
}(jQuery));

// $(function() {
// var url = window.location;
// var element = $('ul.nav a').filter(function() {
// return this.href == url || url.href.indexOf(this.href) == 0;
// }).addClass('active').parent().parent().addClass('in').parent();
// if (element.is('li')) {
// element.addClass('active');
// }
// }(jQuery));

/*
 * SIDEBAR MENU ------------ This is a custom plugin for the sidebar menu. It
 * provides a tree view.
 * 
 * Usage: $(".sidebar).tree();
 * 
 * Note: This plugin does not accept any options. Instead, it only requires a
 * class added to the element that contains a sub-menu.
 * 
 * When used with the sidebar, for example, it would look something like this:
 * <ul class='sidebar-menu'> <li class="treeview active"> <a href="#>Menu</a>
 * <ul class='treeview-menu'> <li class='active'><a href=#>Level 1</a></li>
 * </ul> </li> </ul>
 * 
 * Add .active class to <li> elements if you want the menu to be open
 * automatically on page load. See above for an example.
 */
(function($) {
	"use strict";

	$.fn.tree = function() {

		return this.each(function() {
			var btn = $(this).children("a").first();
			var menu = $(this).children(".nav-second-level").first();
			var isActive = $(this).hasClass('active');

			// initialize already active menus
			if (isActive) {
				menu.show();
				btn.children(".fa-angle-left").first().removeClass(
						"fa-angle-left").addClass("fa-angle-down");
			}
			// Slide open or close the menu on link click
			btn.click(function(e) {
				e.preventDefault();
				if (isActive) {
					// Slide up to close menu
					menu.slideUp();
					isActive = false;
					btn.children(".fa-angle-down").first().removeClass(
							"fa-angle-down").addClass("fa-angle-left");
					btn.parent("li").removeClass("active");
				} else {
					// Slide down to open menu
					menu.slideDown();
					isActive = true;
					btn.children(".fa-angle-left").first().removeClass(
							"fa-angle-left").addClass("fa-angle-down");
					btn.parent("li").addClass("active");
				}
			});

			/* Add margins to submenu elements to give it a tree look */
			menu.find("li > a").each(function() {
				var pad = parseInt($(this).css("margin-left")) + 10;

				$(this).css({
					"margin-left" : pad + "px"
				});
			});

		});

	};

}(jQuery));

// Loads the correct sidebar on window load,
// collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size
$(function() {
	$(window)
			.bind(
					"load resize",
					function() {
						topOffset = 50;
						width = (this.window.innerWidth > 0) ? this.window.innerWidth
								: this.screen.width;
						if (width < 768) {
							$('div.navbar-collapse').addClass('collapse');
							topOffset = 100; // 2-row-menu
						} else {
							$('div.navbar-collapse').removeClass('collapse');
						}

						height = ((this.window.innerHeight > 0) ? this.window.innerHeight
								: this.screen.height) - 1;
						height = height - topOffset;
						if (height < 1) {
							height = 1;
						}
						if (height > topOffset) {
							$(".content").css("min-height", (height) + "px");
						}
					});

	var url = window.location;
	var element = $('ul.nav a').filter(function() {
		return this.href == url || url.href.indexOf(this.href) == 0;
	}).addClass('active').parent().parent().addClass('in').parent();
	if (element.is('li')) {
		element.addClass('active');
	}
}(jQuery));

/*******************************************************************************
 * ! Author: Abdullah A Almsaeed Date: 4 Jan 2014 Description: This file should
 * be included in all pages !
 ******************************************************************************/

/*
 * Global variables. If you change any of these vars, don't forget to change the
 * values in the less files!
 */
var left_side_width = 220; // Sidebar width in pixels

$(function() {
	"use strict";

	// Enable sidebar toggle
	$("[data-toggle='offcanvas']").click(function(e) {
		e.preventDefault();

		// If window is small enough, enable sidebar push menu
		if ($(window).width() <= 992) {
			$('.row-offcanvas').toggleClass('active');
			$('.left-side').removeClass("collapse-left");
			$(".right-side").removeClass("strech");
			$('.row-offcanvas').toggleClass("relative");
		} else {
			// Else, enable content streching
			$('.left-side').toggleClass("collapse-left");
			$(".right-side").toggleClass("strech");
		}
	});

	// Add hover support for touch devices
	$('.btn').bind('touchstart', function() {
		$(this).addClass('hover');
	}).bind('touchend', function() {
		$(this).removeClass('hover');
	});

	// Activate tooltips
	$("[data-toggle='tooltip']").tooltip();
	//
	// /*
	// * Add collapse and remove events to boxes
	// */
	$("[data-widget='collapse']").click(
			function() {
				// Find the box parent
				var box = $(this).parents(".box").first();
				// Find the body and the footer
				var bf = box.find(".box-body, .box-footer");
				if (!box.hasClass("collapsed-box")) {
					box.addClass("collapsed-box");
					// Convert minus into plus
					$(this).children(".fa-minus").removeClass("fa-minus")
							.addClass("fa-plus");
					bf.slideUp();
				} else {
					box.removeClass("collapsed-box");
					// Convert plus into minus
					$(this).children(".fa-plus").removeClass("fa-plus")
							.addClass("fa-minus");
					bf.slideDown();
				}
			});
}(jQuery));

/**
 * Vertically center Bootstrap 3 modals so they aren't always stuck at the top
 */
// $(function() {
// // function reposition() {
// // var modal = $(this), dialog = modal.find('.ui-overlaypanel');
// // modal.css('display', 'block');
// //
// // // Dividing by two centers the modal exactly, but dividing by three
// // // or four works better for larger screens.
// // dialog.css("margin-top", Math.max(0, ($(window).height() - dialog
// // .height()) / 2));
// // }
// // // Reposition when a modal is shown
// // $('.ui-overlaypanel').on('show.ui-overlaypanel', reposition);
// // // Reposition when the window is resized
// // $(window).on('resize', function() {
// // $('.ui-overlaypanel:visible').each(reposition);
// // });
// $(".ui-overlaypanel").modal('show').css({
// 'margin-top': function () { //vertical centering
// return -($(this).height() / 2);
// },
// 'margin-left': function () { //Horizontal centering
// return -($(this).width() / 2);
// }
// });
// });
//
// $(document).ready(function() {
// var heightMargin = -($('.ui-overlaypanel').height() / 2);
// var widthMargin = -($('.ui-overlaypanel').width() / 2);
// $('.ui-overlaypanel').css('margin-left', widthMargin);
// $('.ui-overlaypanel').css('margin-top', heightMargin);
// });
//
// $(window).resize(function() {
// var heightMargin = -($('.ui-overlaypanel').height() / 2);
// var widthMargin = -($('.ui-overlaypanel').width() / 2);
// $('.ui-overlaypanel').css('margin-left', widthMargin);
// $('.ui-overlaypanel').css('margin-top', heightMargin);
// });
