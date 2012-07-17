package pl.edu.icm.yadda.analysis.metadata.zoneclassification.features;

import pl.edu.icm.yadda.analysis.classification.features.FeatureCalculator;
import pl.edu.icm.yadda.analysis.textr.model.BxPage;
import pl.edu.icm.yadda.analysis.textr.model.BxZone;

public class BracketRelativeCount implements FeatureCalculator<BxZone, BxPage> {

	private static String featureName = "BracketRelativeCount";
	
	@Override
	public String getFeatureName() {
		return featureName;
	}

	@Override
	public double calculateFeatureValue(BxZone zone, BxPage page) {
		double brackets = new BracketCountFeature().calculateFeatureValue(zone, page);
		double chars = new CharCountFeature().calculateFeatureValue(zone, page);
		return brackets/chars; 
	}
}
