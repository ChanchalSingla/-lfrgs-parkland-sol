<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
	<link rel="stylesheet" href="${css_folder}/plugins/slick-theme.css" />
	<link rel="stylesheet" href="${css_folder}/plugins/slick.css" />

</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div id="wrapper">

	<h2 class="hide-accessible sr-only" role="heading" aria-level="1">${the_title}</h2>

	<#if selectable>
		<@liferay_util["include"] page=content_include />
	<#else>
		${portletDisplay.recycle()}

		${portletDisplay.setTitle(the_title)}

		<@liferay_theme["wrap-portlet"] page="portlet.ftl">
			<@liferay_util["include"] page=content_include />
		</@>
	</#if>
	
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />
<script type="text/javascript" data-senna-track="permanent" src="${javascript_folder}/plugins/slick.min.js"></script>
</body>

</html>