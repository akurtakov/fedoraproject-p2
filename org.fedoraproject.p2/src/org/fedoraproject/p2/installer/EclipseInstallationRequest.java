/*******************************************************************************
 * Copyright (c) 2014 Red Hat Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc. - initial API and implementation
 *******************************************************************************/
package org.fedoraproject.p2.installer;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Mikolaj Izdebski
 */
public class EclipseInstallationRequest {
	private final Set<Path> plugins = new LinkedHashSet<>();

	private final Set<Path> features = new LinkedHashSet<>();

	private Path buildRoot;

	private final List<Path> configFiles = new ArrayList<>();

	private final Map<String, String> packageMappings = new LinkedHashMap<>();

	private String mainPackageId;

	private boolean ignoreOptional = false;

	public Path getBuildRoot() {
		return buildRoot;
	}

	public void setBuildRoot(Path buildRoot) {
		this.buildRoot = buildRoot;
	}

	public Set<Path> getPlugins() {
		return Collections.unmodifiableSet(plugins);
	}

	public void addPlugin(Path plugin) {
		plugins.add(plugin);
	}

	public Set<Path> getFeatures() {
		return Collections.unmodifiableSet(features);
	}

	public void addFeature(Path feature) {
		features.add(feature);
	}

	public List<Path> getConfigFiles() {
		return Collections.unmodifiableList(configFiles);
	}

	public void addConfigFile(Path confFile) {
		configFiles.add(confFile);
	}

	public Map<String, String> getPackageMappings() {
		return Collections.unmodifiableMap(packageMappings);
	}

	public void addPackageMapping(String artifactId, String packageId) {
		packageMappings.put(artifactId, packageId);
	}

	public String getMainPackageId() {
		return mainPackageId;
	}

	public void setMainPackageId(String mainPackageId) {
		this.mainPackageId = mainPackageId;
	}

	public void setIgnoreOptional(boolean ignore) {
		ignoreOptional = ignore;
	}

	public boolean ignoreOptional() {
		return ignoreOptional;
	}
}
