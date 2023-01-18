# Capstone-ELAN-Extension
Open source extension of ELAN video annotation software to enable annotation and mapping of body and motion mannerisms within the ELAN software


** FOR ELAN Extension (min)
1. Allow import of .eaf media files where user can provide motions corresponding to ASL
2. Extend existing ELAN software to allow for use of body landmark software (i.e. OpenPose etc.) within ELAN
3. allow export of remappable body landmarks so those signs can be interpreted using sign datasets
	3a. exported landmarks will be in html format and thus will be interpreted by 

**Desirable (extra)
1. Sortware should be able to identify start/end frames of motions and hand signs
2. Software may use these windows to interpret signs via comparison to exisintg ASL datasets
	-- This approach entails motion recognition and translation within the same software (as opposed to approach 1, which is map + export) 