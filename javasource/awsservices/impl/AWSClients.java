package awsservices.impl;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;

import awsservices.impl.clientcache.ClientCache;
import awsservices.proxies.Credentials;
import software.amazon.awssdk.core.SdkClient;
import software.amazon.awssdk.http.apache.ApacheHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sts.StsClient;

public class AWSClients {
	
	public static synchronized SqsClient getSqsClient(IContext context, Credentials credentials) throws CoreException {
		SdkClient client = ClientCache.getClient(context, SqsClient.SERVICE_NAME, credentials);
		if (client == null) {
			AWSHelper.LOGGER.info("Creating client for " + SqsClient.SERVICE_NAME + "(" + credentials.getIdentifier() + ").");
			Region region = Region.of(credentials.getRegionName());
			CredentialsProvider credentialsProvider = getCredentialsProvider(context, credentials);
			SqsClient newClient = SqsClient.builder().credentialsProvider(
					credentialsProvider.getAwsCredentialsProvider())
					.httpClientBuilder(ApacheHttpClient.builder())
					.region(region)
					.build();
			ClientCache.addClient(context, SqsClient.SERVICE_NAME, credentials, 
					credentialsProvider.getExpiration(), newClient);
			return newClient;
		} else {
			return (SqsClient) client;
		}
	}
	
	public static synchronized S3Client getS3Client(IContext context, Credentials credentials) throws CoreException {
		SdkClient client = ClientCache.getClient(context, S3Client.SERVICE_NAME, credentials);
		if (client == null) {
			AWSHelper.LOGGER.info("Creating client for " + S3Client.SERVICE_NAME + "(" + credentials.getIdentifier() + ").");
			Region region = Region.of(credentials.getRegionName());
			CredentialsProvider credentialsProvider = getCredentialsProvider(context, credentials);
			S3Client newClient = S3Client.builder().credentialsProvider(
					credentialsProvider.getAwsCredentialsProvider())
					.httpClientBuilder(ApacheHttpClient.builder())
					.region(region)
					.build();
			ClientCache.addClient(context, S3Client.SERVICE_NAME, credentials, 
					credentialsProvider.getExpiration(), newClient);
			return newClient;
		} else {
			return (S3Client) client;
		}
	}
	
	public static synchronized StsClient getStsClient(IContext context, Credentials credentials) throws CoreException {
		SdkClient client = ClientCache.getClient(context, StsClient.SERVICE_NAME, credentials);
		if (client == null) {
			AWSHelper.LOGGER.info("Creating client for " + StsClient.SERVICE_NAME + "(" + credentials.getIdentifier() + ").");
			Region region = Region.of(credentials.getRegionName());
			CredentialsProvider credentialsProvider = getCredentialsProvider(context, credentials);
			StsClient newClient = StsClient.builder().credentialsProvider(
					credentialsProvider.getAwsCredentialsProvider())
					.httpClientBuilder(ApacheHttpClient.builder())
					.region(region)
					.build();
			ClientCache.addClient(context, StsClient.SERVICE_NAME, credentials, 
					credentialsProvider.getExpiration(), newClient);
			return newClient;
		} else {
			return (StsClient) client;
		}
	}

	public static synchronized SnsClient getSnsClient(IContext context, Credentials credentials) throws CoreException {
		SdkClient client = ClientCache.getClient(context, SnsClient.SERVICE_NAME, credentials);
		if (client == null) {
			AWSHelper.LOGGER.info("Creating client for " + SnsClient.SERVICE_NAME + "(" + credentials.getIdentifier() + ").");
			Region region = Region.of(credentials.getRegionName());
			CredentialsProvider credentialsProvider = getCredentialsProvider(context, credentials);
			SnsClient newClient = SnsClient.builder().credentialsProvider(
					credentialsProvider.getAwsCredentialsProvider())
					.httpClientBuilder(ApacheHttpClient.builder())
					.region(region)
					.build();
			ClientCache.addClient(context, SnsClient.SERVICE_NAME, credentials,
					credentialsProvider.getExpiration(), newClient);
			return newClient;
		} else {
			return (SnsClient) client;
		}
	}

	private static CredentialsProvider getCredentialsProvider(IContext context, Credentials credentials) {
		switch (credentials.getProvider()) {
			case _STATIC: return new StaticCredentialsProvider(context, credentials);
			case COGNITO: return new CognitoCredentialsProvider(context, credentials);
		}

		throw new IllegalStateException("Unimplemented credentials provider:" + credentials.getProvider().getCaption());
	}
}
