/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ComponentIssuesCount;
import io.swagger.client.model.PageBeanComponentWithIssueCount;
import io.swagger.client.model.ProjectComponent;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectComponentsApi
 */
@Ignore
public class ProjectComponentsApiTest {

    private final ProjectComponentsApi api = new ProjectComponentsApi();

    /**
     * Create component
     *
     * Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createComponentTest() throws Exception {
        ProjectComponent body = null;
        ProjectComponent response = api.createComponent(body);

        // TODO: test validations
    }
    /**
     * Delete component
     *
     * Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteComponentTest() throws Exception {
        String id = null;
        String moveIssuesTo = null;
        api.deleteComponent(id, moveIssuesTo);

        // TODO: test validations
    }
    /**
     * Get component
     *
     * Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getComponentTest() throws Exception {
        String id = null;
        ProjectComponent response = api.getComponent(id);

        // TODO: test validations
    }
    /**
     * Get component issues count
     *
     * Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getComponentRelatedIssuesTest() throws Exception {
        String id = null;
        ComponentIssuesCount response = api.getComponentRelatedIssues(id);

        // TODO: test validations
    }
    /**
     * Get project components
     *
     * Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectComponentsTest() throws Exception {
        String projectIdOrKey = null;
        List<ProjectComponent> response = api.getProjectComponents(projectIdOrKey);

        // TODO: test validations
    }
    /**
     * Get project components paginated
     *
     * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectComponentsPaginatedTest() throws Exception {
        String projectIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String query = null;
        PageBeanComponentWithIssueCount response = api.getProjectComponentsPaginated(projectIdOrKey, startAt, maxResults, orderBy, query);

        // TODO: test validations
    }
    /**
     * Update component
     *
     * Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateComponentTest() throws Exception {
        ProjectComponent body = null;
        String id = null;
        ProjectComponent response = api.updateComponent(body, id);

        // TODO: test validations
    }
}
