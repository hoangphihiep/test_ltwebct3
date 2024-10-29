package vn.iotstar.configs;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class CustomSiteMeshFilter extends ConfigurableSiteMeshFilter {
	
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/web.jsp");
		builder.addDecoratorPath("/admin/*", "/admin.jsp");
		builder.addExcludedPath("/v1/api/*");
	}

}
