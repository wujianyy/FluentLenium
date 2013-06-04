/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package org.fluentlenium.cucumber.step;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.cucumber.adapter.FluentCucumberAdapter;
import org.fluentlenium.cucumber.adapter.util.SharedDriver;
import org.fluentlenium.cucumber.page.LocalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@SharedDriver(type = SharedDriver.SharedType.PER_SCENARIO)
public class SimpleScenarioMultiStep1 extends FluentCucumberAdapter {

    @Page
    LocalPage page;

	@Override
	public WebDriver getDefaultDriver() {
		return new HtmlUnitDriver();
	}

    @Given(value = "scenario multi1 I am on the first page")
    public void step1() {
		this.initFluent();
		this.initTest();
		goTo(page);
    }

    @After
    public void after() {
		this.quit();
    }

}
