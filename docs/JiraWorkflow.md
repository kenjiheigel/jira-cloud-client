# JiraWorkflow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the workflow. |  [optional]
**id** | **String** | The ID of the workflow. |  [optional]
**isEditable** | **Boolean** | Indicates if the workflow can be edited. |  [optional]
**name** | **String** | The name of the workflow. |  [optional]
**scope** | [**WorkflowScope**](WorkflowScope.md) |  |  [optional]
**startPointLayout** | [**WorkflowLayout**](WorkflowLayout.md) |  |  [optional]
**statuses** | [**List&lt;WorkflowReferenceStatus&gt;**](WorkflowReferenceStatus.md) | The statuses referenced in this workflow. |  [optional]
**taskId** | **String** | If there is a current [asynchronous task](#async-operations) operation for this workflow. |  [optional]
**transitions** | [**List&lt;WorkflowTransitions&gt;**](WorkflowTransitions.md) | The transitions of the workflow. |  [optional]
**usages** | [**List&lt;ProjectIssueTypes&gt;**](ProjectIssueTypes.md) | The &#x60;workflows.usages&#x60; expand is an optional parameter that can be used when reading and updating workflows in Jira. It provides additional information about the projects and issue types associated with the requested workflows. |  [optional]
**version** | [**DocumentVersion**](DocumentVersion.md) |  |  [optional]
