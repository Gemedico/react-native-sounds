# React-Native Sounds

An very lite module to play system sounds and beep for react-native apps (no sound files)

[![NPM Version][npm-image]][npm-url]
[![NPM Downloads][downloads-image]][downloads-url]

## Installation

This is a [Node.js](https://nodejs.org/en/) module available through the
[npm registry](https://www.npmjs.com/).

```bash
$ npm install @gemedico/react-native-sounds
```

### Mostly automatic installation

```bash
$ react-native link @gemedico/react-native-sounds
```

### IOS

```bash
$ cd ios
$ pod install
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
