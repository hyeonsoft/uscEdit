package git.hyeonsoft.uscEdit.uscBackgroundEditor.EffectType;

public interface EffectType {
	public String getLuaScript();
	public void setParameter(int n, String parameter) ;
	public String getInfo();
}