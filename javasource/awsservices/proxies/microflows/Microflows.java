// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package awsservices.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the AWSServices module
	public static void aCT_SaveCredentials(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.ACT_SaveCredentials").withParams(params).execute(context);
	}
	public static void aCT_ValidateConfiguration(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.ACT_ValidateConfiguration").withParams(params).execute(context);
	}
	public static void afterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AWSServices.AfterStartup").withParams(params).execute(context);
	}
	public static boolean bCo_CognitoCredentials(IContext context, awsservices.proxies.CognitoCredentials _cognitoCredentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CognitoCredentials", _cognitoCredentials == null ? null : _cognitoCredentials.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("AWSServices.BCo_CognitoCredentials").withParams(params).execute(context);
	}
	public static boolean bCo_Credentials(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("AWSServices.BCo_Credentials").withParams(params).execute(context);
	}
	public static boolean bCo_StaticCredentials(IContext context, awsservices.proxies.StaticCredentials _staticCredentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StaticCredentials", _staticCredentials == null ? null : _staticCredentials.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("AWSServices.BCo_StaticCredentials").withParams(params).execute(context);
	}
	public static awsservices.proxies.CognitoCredentials dS_GetCognitoCredentialsProvider(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("AWSServices.DS_GetCognitoCredentialsProvider").withParams(params).execute(context);
		return result == null ? null : awsservices.proxies.CognitoCredentials.initialize(context, result);
	}
	public static awsservices.proxies.QueueAttributes dS_GetQueueAttributes(IContext context, awsservices.proxies.Queue _queue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("AWSServices.DS_GetQueueAttributes").withParams(params).execute(context);
		return result == null ? null : awsservices.proxies.QueueAttributes.initialize(context, result);
	}
	public static java.util.List<awsservices.proxies.Queue> dS_GetQueues(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("AWSServices.DS_GetQueues").withParams(params).execute(context);
		java.util.List<awsservices.proxies.Queue> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(awsservices.proxies.Queue.initialize(context, obj));
		}
		return result;
	}
	public static awsservices.proxies.StaticCredentials dS_GetStaticCredentialsProvider(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("AWSServices.DS_GetStaticCredentialsProvider").withParams(params).execute(context);
		return result == null ? null : awsservices.proxies.StaticCredentials.initialize(context, result);
	}
	public static java.util.List<awsservices.proxies.Topic> dS_ListTopics(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("AWSServices.DS_ListTopics").withParams(params).execute(context);
		java.util.List<awsservices.proxies.Topic> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(awsservices.proxies.Topic.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<awsservices.proxies.Message> dS_Receive10MessagesFromQueue(IContext context, awsservices.proxies.Queue _queue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("AWSServices.DS_Receive10MessagesFromQueue").withParams(params).execute(context);
		java.util.List<awsservices.proxies.Message> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(awsservices.proxies.Message.initialize(context, obj));
		}
		return result;
	}
	public static void iVK_CopyObject(IContext context, awsservices.proxies.S3Object _s3Object, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("S3Object", _s3Object == null ? null : _s3Object.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_CopyObject").withParams(params).execute(context);
	}
	public static void iVK_CopyObjectConfirm(IContext context, awsservices.proxies.MoveOrCopyObject _moveOrCopyObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MoveOrCopyObject", _moveOrCopyObject == null ? null : _moveOrCopyObject.getMendixObject());
		Core.microflowCall("AWSServices.IVK_CopyObjectConfirm").withParams(params).execute(context);
	}
	public static void iVK_CreateQueue(IContext context, awsservices.proxies.CreateQueueRequest _createQueueRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("CreateQueueRequest", _createQueueRequest == null ? null : _createQueueRequest.getMendixObject());
		Core.microflowCall("AWSServices.IVK_CreateQueue").withParams(params).execute(context);
	}
	public static void iVK_CreateQueueRequest(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.IVK_CreateQueueRequest").withParams(params).execute(context);
	}
	public static void iVK_DeleteMessage(IContext context, awsservices.proxies.Message _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Message", _message == null ? null : _message.getMendixObject());
		Core.microflowCall("AWSServices.IVK_DeleteMessage").withParams(params).execute(context);
	}
	public static void iVK_DeleteObject(IContext context, awsservices.proxies.Explorer _explorer, awsservices.proxies.S3Object _s3Object)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		params.put("S3Object", _s3Object == null ? null : _s3Object.getMendixObject());
		Core.microflowCall("AWSServices.IVK_DeleteObject").withParams(params).execute(context);
	}
	public static void iVK_DeleteQueue(IContext context, awsservices.proxies.Queue _queue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		Core.microflowCall("AWSServices.IVK_DeleteQueue").withParams(params).execute(context);
	}
	public static void iVK_DownloadObject(IContext context, awsservices.proxies.S3Object _s3Object, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("S3Object", _s3Object == null ? null : _s3Object.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_DownloadObject").withParams(params).execute(context);
	}
	public static void iVK_EditText(IContext context, awsservices.proxies.S3Object _s3Object, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("S3Object", _s3Object == null ? null : _s3Object.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_EditText").withParams(params).execute(context);
	}
	public static void iVK_ExploreBucket(IContext context, awsservices.proxies.Bucket _bucket, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Bucket", _bucket == null ? null : _bucket.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_ExploreBucket").withParams(params).execute(context);
	}
	public static void iVK_ExplorePrefix(IContext context, awsservices.proxies.Prefix _prefix, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Prefix", _prefix == null ? null : _prefix.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_ExplorePrefix").withParams(params).execute(context);
	}
	public static void iVK_ExploreS3(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.IVK_ExploreS3").withParams(params).execute(context);
	}
	public static void iVK_FindMostRecent5Objects(IContext context, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_FindMostRecent5Objects").withParams(params).execute(context);
	}
	public static void iVK_GetSingleMessage(IContext context, awsservices.proxies.Queue _queue, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.IVK_GetSingleMessage").withParams(params).execute(context);
	}
	public static void iVK_MoveObject(IContext context, awsservices.proxies.S3Object _s3Object, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("S3Object", _s3Object == null ? null : _s3Object.getMendixObject());
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_MoveObject").withParams(params).execute(context);
	}
	public static void iVK_MoveObjectConfirm(IContext context, awsservices.proxies.MoveOrCopyObject _moveObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MoveObject", _moveObject == null ? null : _moveObject.getMendixObject());
		Core.microflowCall("AWSServices.IVK_MoveObjectConfirm").withParams(params).execute(context);
	}
	public static void iVK_OpenQueueRequest(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.IVK_OpenQueueRequest").withParams(params).execute(context);
	}
	public static void iVK_OpenReceive10Messages(IContext context, awsservices.proxies.Queue _queue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		Core.microflowCall("AWSServices.IVK_OpenReceive10Messages").withParams(params).execute(context);
	}
	public static void iVK_Publish(IContext context, awsservices.proxies.PublishRequest _publishRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PublishRequest", _publishRequest == null ? null : _publishRequest.getMendixObject());
		Core.microflowCall("AWSServices.IVK_Publish").withParams(params).execute(context);
	}
	public static void iVK_PublishRequest(IContext context, awsservices.proxies.Topic _topic)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Topic", _topic == null ? null : _topic.getMendixObject());
		Core.microflowCall("AWSServices.IVK_PublishRequest").withParams(params).execute(context);
	}
	public static void iVK_PurgeQueue(IContext context, awsservices.proxies.Queue _queue, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		Core.microflowCall("AWSServices.IVK_PurgeQueue").withParams(params).execute(context);
	}
	public static void iVK_RetrieveBuckets(IContext context, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_RetrieveBuckets").withParams(params).execute(context);
	}
	public static void iVK_RetrieveObjects(IContext context, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_RetrieveObjects").withParams(params).execute(context);
	}
	public static void iVK_RetrievePrefixes(IContext context, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_RetrievePrefixes").withParams(params).execute(context);
	}
	public static void iVK_SaveAsText(IContext context, awsservices.proxies.GetAsText _getAsText)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GetAsText", _getAsText == null ? null : _getAsText.getMendixObject());
		Core.microflowCall("AWSServices.IVK_SaveAsText").withParams(params).execute(context);
	}
	public static void iVK_SendMessage(IContext context, awsservices.proxies.SendMessageRequest _sendMessageRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SendMessageRequest", _sendMessageRequest == null ? null : _sendMessageRequest.getMendixObject());
		Core.microflowCall("AWSServices.IVK_SendMessage").withParams(params).execute(context);
	}
	public static void iVK_SendMessageRequest(IContext context, awsservices.proxies.Credentials _credentials, awsservices.proxies.Queue _queue)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		params.put("Queue", _queue == null ? null : _queue.getMendixObject());
		Core.microflowCall("AWSServices.IVK_SendMessageRequest").withParams(params).execute(context);
	}
	public static void iVK_UploadObject(IContext context, awsservices.proxies.Explorer _explorer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Explorer", _explorer == null ? null : _explorer.getMendixObject());
		Core.microflowCall("AWSServices.IVK_UploadObject").withParams(params).execute(context);
	}
	public static void iVK_UploadObjectConfirm(IContext context, awsservices.proxies.PutObject _putObject)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PutObject", _putObject == null ? null : _putObject.getMendixObject());
		Core.microflowCall("AWSServices.IVK_UploadObjectConfirm").withParams(params).execute(context);
	}
	public static boolean sub_ValidateCredentials(IContext context, awsservices.proxies.Credentials _credentials)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Credentials", _credentials == null ? null : _credentials.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("AWSServices.Sub_ValidateCredentials").withParams(params).execute(context);
	}
}