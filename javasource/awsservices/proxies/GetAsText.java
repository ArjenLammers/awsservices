// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package awsservices.proxies;

public class GetAsText
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject getAsTextMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AWSServices.GetAsText";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Text("Text"),
		GetAsText_Explorer("AWSServices.GetAsText_Explorer"),
		GetAsText_S3Object("AWSServices.GetAsText_S3Object");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public GetAsText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AWSServices.GetAsText"));
	}

	protected GetAsText(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject getAsTextMendixObject)
	{
		if (getAsTextMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AWSServices.GetAsText", getAsTextMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AWSServices.GetAsText");

		this.getAsTextMendixObject = getAsTextMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'GetAsText.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static awsservices.proxies.GetAsText initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return awsservices.proxies.GetAsText.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static awsservices.proxies.GetAsText initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new awsservices.proxies.GetAsText(context, mendixObject);
	}

	public static awsservices.proxies.GetAsText load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return awsservices.proxies.GetAsText.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of GetAsText_Explorer
	 */
	public final awsservices.proxies.Explorer getGetAsText_Explorer() throws com.mendix.core.CoreException
	{
		return getGetAsText_Explorer(getContext());
	}

	/**
	 * @param context
	 * @return value of GetAsText_Explorer
	 */
	public final awsservices.proxies.Explorer getGetAsText_Explorer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		awsservices.proxies.Explorer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GetAsText_Explorer.toString());
		if (identifier != null)
			result = awsservices.proxies.Explorer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GetAsText_Explorer
	 * @param getastext_explorer
	 */
	public final void setGetAsText_Explorer(awsservices.proxies.Explorer getastext_explorer)
	{
		setGetAsText_Explorer(getContext(), getastext_explorer);
	}

	/**
	 * Set value of GetAsText_Explorer
	 * @param context
	 * @param getastext_explorer
	 */
	public final void setGetAsText_Explorer(com.mendix.systemwideinterfaces.core.IContext context, awsservices.proxies.Explorer getastext_explorer)
	{
		if (getastext_explorer == null)
			getMendixObject().setValue(context, MemberNames.GetAsText_Explorer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GetAsText_Explorer.toString(), getastext_explorer.getMendixObject().getId());
	}

	/**
	 * @return value of GetAsText_S3Object
	 */
	public final awsservices.proxies.S3Object getGetAsText_S3Object() throws com.mendix.core.CoreException
	{
		return getGetAsText_S3Object(getContext());
	}

	/**
	 * @param context
	 * @return value of GetAsText_S3Object
	 */
	public final awsservices.proxies.S3Object getGetAsText_S3Object(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		awsservices.proxies.S3Object result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GetAsText_S3Object.toString());
		if (identifier != null)
			result = awsservices.proxies.S3Object.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GetAsText_S3Object
	 * @param getastext_s3object
	 */
	public final void setGetAsText_S3Object(awsservices.proxies.S3Object getastext_s3object)
	{
		setGetAsText_S3Object(getContext(), getastext_s3object);
	}

	/**
	 * Set value of GetAsText_S3Object
	 * @param context
	 * @param getastext_s3object
	 */
	public final void setGetAsText_S3Object(com.mendix.systemwideinterfaces.core.IContext context, awsservices.proxies.S3Object getastext_s3object)
	{
		if (getastext_s3object == null)
			getMendixObject().setValue(context, MemberNames.GetAsText_S3Object.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GetAsText_S3Object.toString(), getastext_s3object.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return getAsTextMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final awsservices.proxies.GetAsText that = (awsservices.proxies.GetAsText) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "AWSServices.GetAsText";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
