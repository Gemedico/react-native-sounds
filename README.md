# React-Native Sounds

An very lite module to play system sounds and beep for react-native apps (no sound files)

[![NPM Version][npm-image]][npm-url]
[![NPM Downloads][downloads-image]][downloads-url]

## Installation

This is a [Node.js](https://nodejs.org/en/) module available through the
[npm registry](https://www.npmjs.com/).

```bash
$ npm install @gemedico/react-native-sounds
$ react-native link
```

### Mostly automatic installation

```bash
$ react-native link @gemedico/react-native-sounds
```

### Manual installation

### Using CocoaPods
> If the CocoaPods package manager is new to you, please first review
> its [installation guide](https://guides.cocoapods.org/using/getting-started.html)
pod 'RNReactNativeSounds', :path => '../node_modules/@gemedico/react-native-sounds'
```ruby
# Uncomment the next line to define a global platform for your project
# platform :ios, '9.0'

target '_YOUR_PROJECT_TARGET_' do
pod 'RNReactNativeSounds', :path => '../node_modules/@gemedico/react-native-sounds'
end
```

```sh
$ cd ios
$ pod install
```
#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `@gemedico/react-native-sounds` and add `RNReactNativeSounds.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeSounds.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeSoundsPackage;` to the imports at the top of the file
  - Add `new RNReactNativeSoundsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':@gemedico/react-native-sounds'
  	project(':@gemedico/react-native-sounds').projectDir = new File(rootProject.projectDir, 	'../node_modules/@gemedico/react-native-sounds/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':@gemedico/react-native-sounds')
  	```

## Usage

```js
import RNSounds from '@gemedico/react-native-sounds';
```

Examples:
```
<Button onPress={ () => {RNSounds.beep()} } title="Beep Success"></Button>
<Button onPress={ () => {RNSounds.beep(false)} } title="Beep Fail"></Button>
<Button onPress={ () => {RNSounds.PlaySysSound(RNSounds.AndroidSoundIDs.TONE_CDMA_ABBR_ALERT)} } title="Beep Android Custom"></Button>
<Button onPress={ () => {RNSounds.PlaySysSound(41)} } title="Beep Something"></Button>
<Button onPress={ () => {RNSounds.PlaySysSound(RNSounds.iOSSoundIDs.AudioToneBusy)} } title="Beep iOS Custom"></Button>
```

## License

  [MIT](LICENSE)

[npm-image]: https://img.shields.io/npm/v/@gemedico/react-native-sounds.svg
[npm-url]: https://npmjs.org/package/@gemedico/react-native-sounds
[downloads-image]: https://img.shields.io/npm/dm/@gemedico/react-native-sounds.svg
[downloads-url]: https://npmcharts.com/compare/@gemedico/react-native-sounds?minimal=true
