package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(awsservices.actions.ExecuteMicroflowInSeparateTransaction.class);
    registrator.registerUserAction(awsservices.actions.S3_CopyObject.class);
    registrator.registerUserAction(awsservices.actions.S3_DeleteObject.class);
    registrator.registerUserAction(awsservices.actions.S3_FindMostRecentObjects.class);
    registrator.registerUserAction(awsservices.actions.S3_GetObject.class);
    registrator.registerUserAction(awsservices.actions.S3_GetObjectAsText.class);
    registrator.registerUserAction(awsservices.actions.S3_ListBuckets.class);
    registrator.registerUserAction(awsservices.actions.S3_ListObjects.class);
    registrator.registerUserAction(awsservices.actions.S3_ListPrefixes.class);
    registrator.registerUserAction(awsservices.actions.S3_MoveObject.class);
    registrator.registerUserAction(awsservices.actions.S3_PutObject.class);
    registrator.registerUserAction(awsservices.actions.S3_PutObjectAsText.class);
    registrator.registerUserAction(awsservices.actions.SQS_CreateQueue.class);
    registrator.registerUserAction(awsservices.actions.SQS_DeleteMessage.class);
    registrator.registerUserAction(awsservices.actions.SQS_DeleteQueue.class);
    registrator.registerUserAction(awsservices.actions.SQS_GetQueueAttributes.class);
    registrator.registerUserAction(awsservices.actions.SQS_ListQueues.class);
    registrator.registerUserAction(awsservices.actions.SQS_PurgeQueue.class);
    registrator.registerUserAction(awsservices.actions.SQS_ReceiveMessage.class);
    registrator.registerUserAction(awsservices.actions.SQS_ReceiveMessages.class);
    registrator.registerUserAction(awsservices.actions.SQS_SendMessage.class);
    registrator.registerUserAction(awsservices.actions.SyncRegions.class);
    registrator.registerUserAction(awsservices.actions.ValidateConnection.class);
    registrator.registerUserAction(encryption.actions.DecryptString.class);
    registrator.registerUserAction(encryption.actions.EncryptString.class);
    registrator.registerUserAction(encryption.actions.GeneratePGPKeyRing.class);
    registrator.registerUserAction(encryption.actions.PGPDecryptDocument.class);
    registrator.registerUserAction(encryption.actions.PGPEncryptDocument.class);
    registrator.registerUserAction(encryption.actions.ValidatePrivateKeyRing.class);
    registrator.registerUserAction(librarylogging.actions.AddLibraryLogListener.class);
    registrator.registerUserAction(librarylogging.actions.InitializeLogging.class);
    registrator.registerUserAction(librarylogging.actions.SetRootLevel.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
