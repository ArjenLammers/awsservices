// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package awsservices.actions;

import java.util.LinkedList;
import java.util.List;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import awsservices.impl.AWSClients;
import awsservices.proxies.Queue;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.ListQueuesResponse;

public class SQS_ListQueues extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __credentials;
	private awsservices.proxies.Credentials credentials;

	public SQS_ListQueues(IContext context, IMendixObject credentials)
	{
		super(context);
		this.__credentials = credentials;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.credentials = __credentials == null ? null : awsservices.proxies.Credentials.initialize(getContext(), __credentials);

		// BEGIN USER CODE
		List<IMendixObject> result = new LinkedList<>();
		SqsClient sqs = AWSClients.getSqsClient(getContext(), credentials);
		
		ListQueuesResponse res = sqs.listQueues();
		
		for(String queueUrl : res.queueUrls()) {
			Queue q = new Queue(getContext());
			q.setUrl(queueUrl);
			result.add(q.getMendixObject());
		}
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SQS_ListQueues";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
