
Pod::Spec.new do |s|
  s.name         = "RNReactNativeSounds"
  s.version      = "1.0.4"
  s.summary      = "Play system sounds"
  s.description  = <<-DESC
                  RNReactNativeSounds
                   DESC
  s.homepage     = "https://github.com/Gemedico/react-native-sounds.git"
  s.license      = "FREE"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "trietho@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/Gemedico/react-native-sounds.git", :tag => "master" }
  s.source_files  = "**/*.{h,m}"
  s.requires_arc = true

  s.dependency "React"
  #s.dependency "others"

end
