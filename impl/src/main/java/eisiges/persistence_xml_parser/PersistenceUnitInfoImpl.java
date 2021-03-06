package eisiges.persistence_xml_parser;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import javax.persistence.SharedCacheMode;
import javax.persistence.ValidationMode;
import javax.persistence.spi.ClassTransformer;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.PersistenceUnitTransactionType;
import javax.sql.DataSource;

public class PersistenceUnitInfoImpl implements PersistenceUnitInfo {

	String persistenceUnitName;
	String persistenceProviderClassName;
	PersistenceUnitTransactionType transactionType;
	DataSource jtaDataSource;
	String jtaDataSourceUrl;
	DataSource nonJtaDataSource;
	String nonJtaDataSourceUrl;
	List<String> mappingFileNames;
	URL persistenceUnitRootUrl;
	List<String> managedClassNames;
	boolean excludeUnlistedClasses;
	Properties properties;
	String persistenceXMLSchemaVersion;

	@Override
	public String getPersistenceUnitName() {
		return persistenceUnitName;
	}

	public void setPersistenceUnitName(String persistenceUnitName) {
		this.persistenceUnitName = persistenceUnitName;
	}

	@Override
	public String getPersistenceProviderClassName() {
		return persistenceProviderClassName;
	}

	public void setPersistenceProviderClassName(String persistenceProviderClassName) {
		this.persistenceProviderClassName = persistenceProviderClassName;
	}

	@Override
	public PersistenceUnitTransactionType getTransactionType() {
		if (transactionType == null) {
			return PersistenceUnitTransactionType.RESOURCE_LOCAL;
		}
		return transactionType;
	}

	public void setTransactionType(PersistenceUnitTransactionType transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public DataSource getJtaDataSource() {
		return jtaDataSource;
	}

	public void setJtaDataSource(DataSource jtaDataSource) {
		this.jtaDataSource = jtaDataSource;
	}

	public String getJtaDataSourceUrl() {
		return jtaDataSourceUrl;
	}

	public void setJtaDataSourceUrl(String jtaDataSourceUrl) {
		this.jtaDataSourceUrl = jtaDataSourceUrl;
	}

	@Override
	public DataSource getNonJtaDataSource() {
		return nonJtaDataSource;
	}

	public void setNonJtaDataSource(DataSource nonJtaDataSource) {
		this.nonJtaDataSource = nonJtaDataSource;
	}

	public String getNonJtaDataSourceUrl() {
		return nonJtaDataSourceUrl;
	}

	public void setNonJtaDataSourceUrl(String nonJtaDataSourceUrl) {
		this.nonJtaDataSourceUrl = nonJtaDataSourceUrl;
	}

	@Override
	public List<String> getMappingFileNames() {
		return mappingFileNames;
	}

	public void setMappingFileNames(List<String> mappingFileNames) {
		this.mappingFileNames = mappingFileNames;
	}

	@Override
	public List<URL> getJarFileUrls() {
		return Collections.<URL>emptyList();
	}

	@Override
	public URL getPersistenceUnitRootUrl() {
		return persistenceUnitRootUrl;
	}

	public void setPersistenceUnitRootUrl(URL persistenceUnitRootUrl) {
		this.persistenceUnitRootUrl = persistenceUnitRootUrl;
	}

	@Override
	public List<String> getManagedClassNames() {
		return managedClassNames;
	}

	public void setManagedClassNames(List<String> managedClassNames) {
		this.managedClassNames = managedClassNames;
	}

	@Override
	public boolean excludeUnlistedClasses() {
		return excludeUnlistedClasses;
	}

	public void excludeUnlistedClasses(boolean excludeUnlistedClasses) {
		this.excludeUnlistedClasses = excludeUnlistedClasses;
	}

	@Override
	public SharedCacheMode getSharedCacheMode() {
		return SharedCacheMode.UNSPECIFIED; // good default?
	}

	@Override
	public ValidationMode getValidationMode() {
		return ValidationMode.AUTO; // good default?
	}

	@Override
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String getPersistenceXMLSchemaVersion() {
		return persistenceXMLSchemaVersion;
	}

	public void setPersistenceXMLSchemaVersion(String persistenceXMLSchemaVersion) {
		this.persistenceXMLSchemaVersion = persistenceXMLSchemaVersion;
	}

	@Override
	public ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	@Override
	public void addTransformer(ClassTransformer transformer) {
	}

	@Override
	public ClassLoader getNewTempClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	public PersistenceUnitInfo getImmutable() {
		return this; //not right
	}
}
