// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package awsservices.proxies;

public class MoveOrCopyObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject moveOrCopyObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AWSServices.MoveOrCopyObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SourceBucket("SourceBucket"),
		SourceKey("SourceKey"),
		DestinationBucket("DestinationBucket"),
		DestinationKey("DestinationKey"),
		MoveOrCopyObject_Explorer("AWSServices.MoveOrCopyObject_Explorer");

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

	public MoveOrCopyObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AWSServices.MoveOrCopyObject"));
	}

	protected MoveOrCopyObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject moveOrCopyObjectMendixObject)
	{
		if (moveOrCopyObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AWSServices.MoveOrCopyObject", moveOrCopyObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AWSServices.MoveOrCopyObject");

		this.moveOrCopyObjectMendixObject = moveOrCopyObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MoveOrCopyObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static awsservices.proxies.MoveOrCopyObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return awsservices.proxies.MoveOrCopyObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static awsservices.proxies.MoveOrCopyObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new awsservices.proxies.MoveOrCopyObject(context, mendixObject);
	}

	public static awsservices.proxies.MoveOrCopyObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return awsservices.proxies.MoveOrCopyObject.initialize(context, mendixObject);
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
	 * @return value of SourceBucket
	 */
	public final java.lang.String getSourceBucket()
	{
		return getSourceBucket(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceBucket
	 */
	public final java.lang.String getSourceBucket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SourceBucket.toString());
	}

	/**
	 * Set value of SourceBucket
	 * @param sourcebucket
	 */
	public final void setSourceBucket(java.lang.String sourcebucket)
	{
		setSourceBucket(getContext(), sourcebucket);
	}

	/**
	 * Set value of SourceBucket
	 * @param context
	 * @param sourcebucket
	 */
	public final void setSourceBucket(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sourcebucket)
	{
		getMendixObject().setValue(context, MemberNames.SourceBucket.toString(), sourcebucket);
	}

	/**
	 * @return value of SourceKey
	 */
	public final java.lang.String getSourceKey()
	{
		return getSourceKey(getContext());
	}

	/**
	 * @param context
	 * @return value of SourceKey
	 */
	public final java.lang.String getSourceKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SourceKey.toString());
	}

	/**
	 * Set value of SourceKey
	 * @param sourcekey
	 */
	public final void setSourceKey(java.lang.String sourcekey)
	{
		setSourceKey(getContext(), sourcekey);
	}

	/**
	 * Set value of SourceKey
	 * @param context
	 * @param sourcekey
	 */
	public final void setSourceKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sourcekey)
	{
		getMendixObject().setValue(context, MemberNames.SourceKey.toString(), sourcekey);
	}

	/**
	 * @return value of DestinationBucket
	 */
	public final java.lang.String getDestinationBucket()
	{
		return getDestinationBucket(getContext());
	}

	/**
	 * @param context
	 * @return value of DestinationBucket
	 */
	public final java.lang.String getDestinationBucket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DestinationBucket.toString());
	}

	/**
	 * Set value of DestinationBucket
	 * @param destinationbucket
	 */
	public final void setDestinationBucket(java.lang.String destinationbucket)
	{
		setDestinationBucket(getContext(), destinationbucket);
	}

	/**
	 * Set value of DestinationBucket
	 * @param context
	 * @param destinationbucket
	 */
	public final void setDestinationBucket(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String destinationbucket)
	{
		getMendixObject().setValue(context, MemberNames.DestinationBucket.toString(), destinationbucket);
	}

	/**
	 * @return value of DestinationKey
	 */
	public final java.lang.String getDestinationKey()
	{
		return getDestinationKey(getContext());
	}

	/**
	 * @param context
	 * @return value of DestinationKey
	 */
	public final java.lang.String getDestinationKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DestinationKey.toString());
	}

	/**
	 * Set value of DestinationKey
	 * @param destinationkey
	 */
	public final void setDestinationKey(java.lang.String destinationkey)
	{
		setDestinationKey(getContext(), destinationkey);
	}

	/**
	 * Set value of DestinationKey
	 * @param context
	 * @param destinationkey
	 */
	public final void setDestinationKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String destinationkey)
	{
		getMendixObject().setValue(context, MemberNames.DestinationKey.toString(), destinationkey);
	}

	/**
	 * @return value of MoveOrCopyObject_Explorer
	 */
	public final awsservices.proxies.Explorer getMoveOrCopyObject_Explorer() throws com.mendix.core.CoreException
	{
		return getMoveOrCopyObject_Explorer(getContext());
	}

	/**
	 * @param context
	 * @return value of MoveOrCopyObject_Explorer
	 */
	public final awsservices.proxies.Explorer getMoveOrCopyObject_Explorer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		awsservices.proxies.Explorer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MoveOrCopyObject_Explorer.toString());
		if (identifier != null)
			result = awsservices.proxies.Explorer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MoveOrCopyObject_Explorer
	 * @param moveorcopyobject_explorer
	 */
	public final void setMoveOrCopyObject_Explorer(awsservices.proxies.Explorer moveorcopyobject_explorer)
	{
		setMoveOrCopyObject_Explorer(getContext(), moveorcopyobject_explorer);
	}

	/**
	 * Set value of MoveOrCopyObject_Explorer
	 * @param context
	 * @param moveorcopyobject_explorer
	 */
	public final void setMoveOrCopyObject_Explorer(com.mendix.systemwideinterfaces.core.IContext context, awsservices.proxies.Explorer moveorcopyobject_explorer)
	{
		if (moveorcopyobject_explorer == null)
			getMendixObject().setValue(context, MemberNames.MoveOrCopyObject_Explorer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MoveOrCopyObject_Explorer.toString(), moveorcopyobject_explorer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return moveOrCopyObjectMendixObject;
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
			final awsservices.proxies.MoveOrCopyObject that = (awsservices.proxies.MoveOrCopyObject) obj;
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
		return "AWSServices.MoveOrCopyObject";
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