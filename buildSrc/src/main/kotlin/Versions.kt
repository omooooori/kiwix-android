import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
  const val org_jetbrains_kotlinx_kotlinx_coroutines: String = "1.3.9"

  const val androidx_test_espresso: String = "3.2.0" // available: "3.3.0"

  const val com_squareup_retrofit2: String = "2.9.0"

  const val com_squareup_okhttp3: String = "4.9.0"

  const val org_jetbrains_kotlin: String = "1.3.72" // available: "1.4.10"

  const val androidx_navigation: String = "2.3.0"

  const val com_google_dagger: String = "2.28.3" // available: "2.29.1"

  const val com_yahoo_squidb: String = "2.0.0" // available: "3.2.3"

  const val com_jakewharton: String = "10.2.2" // available: "10.2.3"

  const val androidx_test: String = "1.2.0" // available: "1.3.0"

  const val io_objectbox: String = "2.7.0" // available: "2.7.1"

  const val org_jacoco: String = "0.7.9"

  const val io_mockk: String = "1.10.0" // available: "1.10.2"

  const val android_arch_lifecycle_extensions: String = "1.1.1"

  const val com_android_tools_build_gradle: String = "4.0.1" // available: "4.0.2"

  const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

  const val com_github_triplet_play_gradle_plugin: String = "2.8.0" // available: "3.0.0"

  const val javax_annotation_api: String = "1.3.2"

  const val ink_page_indicator: String = "1.3.0"

  const val leakcanary_android: String = "2.4" // available: "2.5"

  const val constraintlayout: String = "1.1.3" // available: "2.0.2"

  const val collection_ktx: String = "1.1.0"

  const val preference_ktx: String = "1.1.1"

  const val junit_jupiter: String = "5.6.2" // available: "5.7.0"

  const val xfetch2okhttp: String = "3.1.5"

  const val assertj_core: String = "3.16.1" // available: "3.17.2"

  const val core_testing: String = "2.1.0"

  const val fragment_ktx: String = "1.2.5"

  const val lint_gradle: String = "27.0.1" // available: "27.0.2"

  const val testing_ktx: String = "1.1.2"

  const val threetenabp: String = "1.2.4"

  const val uiautomator: String = "2.2.0"

  const val annotation: String = "1.1.0"

  const val simple_xml: String = "2.7.1"

  const val appcompat: String = "1.2.0"

  const val rxandroid: String = "2.1.1"

  const val core_ktx: String = "1.3.1" // available: "1.3.2"

  const val kiwixlib: String = "9.4.0"

  const val material: String = "1.2.0" // available: "1.2.1"

  const val multidex: String = "2.0.1"

  const val barista: String = "2.7.1" // available: "3.7.0"

  const val xfetch2: String = "3.1.5"

  const val jsr305: String = "3.0.2"

  const val ktlint: String = "0.36.0" // available: "0.39.0"

  const val rxjava: String = "2.2.19" // available: "2.2.20"

  const val webkit: String = "1.2.0" // available: "1.3.0"

  const val aapt2: String = "4.0.1-6197926" // available: "4.0.2-6197926"

  const val junit: String = "1.1.1" // available: "1.1.2"

  /**
   * Current version: "6.2"
   * See issue 19: How to update Gradle itself?
   * https://github.com/jmfayard/buildSrcVersions/issues/19
   */
  const val gradleLatestVersion: String = "6.6.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
  inline get() =
      id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
