package com.longtextsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;

/**
 * Created by Danish on 5/18/2018.
 */

public class WithoutRecyclerViewActivity extends AppCompatActivity {
    AppCompatTextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);

        textView = (AppCompatTextView) findViewById(R.id.title);

        String terms_and_condition = "<p>Updated hgfhgfhg</p>\n" +
                "\n" +
                "<p><b>1. Your relationship with Test</b></p>\n" +
                "\n" +
                "<p>1.1 Your use of Test's products, software, services, mobile applications, mobile sites and web sites (referred to collectively as the \"Services\" in this document and excluding any services provided to you by Test under a separate written agreement) is subject to the terms of a legal agreement between you and Test. \"Test\" means Test, LLC., whose principal place of business is 12802 Tampa Oaks Blvd, Suite 405, Tampa, Florida 33637-1915. This document explains how the agreement is made up, and sets out some of the terms of that agreement.</p>\n" +
                "\n" +
                "<p>1.2 Unless otherwise agreed in writing with Test, your agreement with Test will always include, at a minimum, the terms and conditions set out in this document. These are referred to below as the \"Universal Terms\".</p>\n" +
                "\n" +
                "<p>1.3 Your agreement with Test will also include the terms of any Legal Notices applicable to the Services, in addition to the Universal Terms. All of these are referred to below as the \"Additional Terms\". Where Additional Terms apply to a Service, these will be accessible for you to read either within, or through your use of, that Service.</p>\n" +
                "\n" +
                "<p>1.4 The Universal Terms, together with the Additional Terms, form a legally binding agreement between you and Test in relation to your use of the Services. It is important that you take the time to read them carefully. Collectively, this legal agreement is referred to below as the \"Terms\".</p>\n" +
                "\n" +
                "<p>1.5 If there is any contradiction between what the Additional Terms say and what the Universal Terms say, then the Additional Terms shall take precedence in relation to that Service.</p>\n" +
                "\n" +
                "<p><b>2. Accepting the Terms</b></p>\n" +
                "\n" +
                "<p>2.1 In order to use the Services, you must first agree to the Terms. You may not use the Services if you do not accept the Terms.</p>\n" +
                "\n" +
                "<p>2.2 You can accept the Terms by:</p>\n" +
                "\n" +
                "<p>(a) Clicking to accept or agree to the Terms, where this option is made available to you by Test in the user interface for any Service;</p>\n" +
                "\n" +
                "<p>(b) By actually using the Services. In this case, you understand and agree that Test will treat your use of the Services as acceptance of the Terms from that point onwards.</p>\n" +
                "\n" +
                "<p>2.3 You may not use the Services and may not accept the Terms if (a) you are not of legal age (13 years old) to form a binding contract with Test, or (b) you are a person barred from receiving the Services under the laws of the United States or other countries including the country in which you are resident or from which you use the Services.</p>\n" +
                "\n" +
                "<p>2.4 Before you continue, yotesthould print off or save a local copy of the Universal Terms for your records.</p>\n" +
                "\n" +
                "<p><b>3. Language of the Terms</b></p>\n" +
                "\n" +
                "<p>3.1 Where Test has provided you with a translation of the English language version of the Terms, then you agree that the translation is provided for your convenience only and that the English language versions of the Terms will govern your relationship with Test.</p>\n" +
                "\n" +
                "<p>3.2 If there is any contradiction between what the English language version of the Terms says and what a translation says, then the English language version shall take precedence.</p>\n" +
                "\n" +
                "<p><b>4. Provision of the Services by Test</b></p>\n" +
                "\n" +
                "<p>4.1 Test has stestidiaries and affiliated legal entities around the world (\"Stestidiaries and Affiliates\"). Sometimes, these companies will be providing the Services to you on behalf of Test itself. You acknowledge and agree that Stestidiaries and Affiliates will be entitled to provide the Services to you.</p>\n" +
                "\n" +
                "<p>4.2 Test is constantly innovating in order to provide the best possible experience for its users. You acknowledge and agree that the form and nature of the Services which Test provides may change from time to time without prior notice to you.</p>\n" +
                "\n" +
                "<p>4.3 As part of this continuing innovation, you acknowledge and agree that Test may stop (permanently or temporarily) providing the Services (or any features within the Services) to you or to users generally at Test's sole discretion, without prior notice to you. You may stop using the Services at any time. You do not need to specifically inform Test when yotesttop using the Services.</p>\n" +
                "\n" +
                "<p>4.4 You acknowledge and agree that if Test disables access to your account, you may be prevented from accessing the Services, your account details or any files or other content which is contained in your account.</p>\n" +
                "\n" +
                "<p>4.5 You acknowledge and agree that while Test may not currently have set a fixed upper limit on the number of transmissions you may send or receive through the Services or on the amount of storage space used for the provision of any Service, such fixed upper limits may be set by Test at any time, at Test's discretion.</p>\n" +
                "\n" +
                "<p><b>5. Use of the Services by you</b></p>\n" +
                "\n" +
                "<p>5.1 In order to access certain Services, you may be required to provide information about yotestelf (such as identification or contact details) as part of the registration process for the Service, or as part of your continued use of the Services. You agree that any registration information you give to Test will always be accurate, correct and up to date.</p>\n" +
                "\n" +
                "<p>5.2 You agree to use the Services only for purposes that are permitted by (a) the Terms and (b) any applicable law, regulation or generally accepted practices or guidelines in the relevant jurisdictions (including any laws regarding the export of data or software to and from the United States or other relevant countries).</p>\n" +
                "\n" +
                "<p>5.3 You agree not to post, upload, publish, submit or transmit any Content that: (i) infringes, misappropriates or violates a third party's patent, copyright, trademark, trade secret, moral rights or other intellectual property rights, or rights of publicity or privacy; (ii) violates, or encourages any conduct that would violate, any applicable law or regulation or would give rise to civil liability; (iii) is fraudulent, false, misleading or deceptive; (iv) is defamatory, obscene, pornographic, vulgar or offensive; (v) promotes discrimination, bigotry, racism, hatred, harassment or harm against any individual or group; (vi) is violent or threatening or promotes violence or actions that are threatening to any person or entity; or (vii) promotes illegal or harmful activities or stesttances.</p>\n" +
                "\n" +
                "<p>5.4 You agree not to access (or attempt to access) any of the Services by any means other than through the interface that is provided by Test, unless you have been specifically allowed to do so in a separate agreement with Test. Yotestpecifically agree not to access (or attempt to access) any of the Services through any automated means (including use of scripts or web crawlers) and shall ensure that you comply with the instructions set out in any limiting file present on the Services.</p>\n" +
                "\n" +
                "<p>5.5 You agree that you will not engage in any activity that interferes with or disrupts the Services (or the servers and networks which are connected to the Services).</p>\n" +
                "\n" +
                "<p>5.6 Unless you have been specifically permitted to do so in a separate agreement with Test, you agree that you will not reproduce, duplicate, copy, sell, trade or resell the Services for any purpose.</p>\n" +
                "\n" +
                "<p>5.7 You agree not to attempt to access or search the Services or Content or download Content from the Services through the use of any engine, software, tool, agent, device or mechanism (including spiders, robots, crawlers, data mining tools or the like) other than the software and/or search agents provided by Test or other generally available third party web browsers or applications.</p>\n" +
                "\n" +
                "<p>5.8 You agree not to send any testolicited or unauthorized advertising, promotional materials, email, text messaging, multimedia messages, junk mail, spam, chain letters or other form of solicitation.</p>\n" +
                "\n" +
                "<p>5.9 You agree that you are solely responsible for (and that Test has no responsibility to you or to any third party for) any breach of your obligations under the Terms and for the consequences (including any loss or damage which Test may suffer) of any such breach.</p>\n" +
                "\n" +
                "<p><b>6. Your account security</b></p>\n" +
                "\n" +
                "<p>6.1 You agree and understand that you are responsible for maintaining the confidentiality of passwords associated with any account you use to access the Services.</p>\n" +
                "\n" +
                "<p>6.2 Accordingly, you agree that you will be solely responsible to Test for all activities that occur under your account.</p>\n" +
                "\n" +
                "<p>6.3 If you become aware of any unauthorized use of your password or of your account, you agree to notify Test immediately at <a href=\"mailto:helpme@Test.com\">helpme@Test.com</a>.</p>\n" +
                "\n" +
                "<p><b>7. Privacy and your personal information</b></p>\n" +
                "\n" +
                "<p>7.1 For information about Test's data protection practices, please read Test's privacy policy at <a href=\"http://about.Test.com/privacy\">http://about.Test.com/privacy</a>. This policy explains how Test treats your personal information, and protects your privacy, when you use the Services.</p>\n" +
                "\n" +
                "<p>7.2 You agree to the use of your data in accordance with Test's privacy policies.</p>\n" +
                "\n" +
                "<p>7.3 You may not engage in display name squatting. Accounts that are inactive for more than six months, or that are determined to be owned by someone other than the name suggests may be removed without further notice. Some of the factors that we take into account when determining what conduct is considered to be username squatting are but not limited to:</p>\n" +
                "\n" +
                "<p>(a) the number of accounts created</p>\n" +
                "\n" +
                "<p>(b) having the display name of a verified Brand or Individual</p>\n" +
                "\n" +
                "<p>(c) creating accounts for the purpose of preventing others from using those display names</p>\n" +
                "\n" +
                "<p>(d) creating accounts for the purpose of selling those accounts</p>\n" +
                "\n" +
                "<p>(e) using feeds of third-party content to update and maintain accounts under the names of those third parties</p>\n" +
                "\n" +
                "<p><b>8. Payment Methods</b></p>\n" +
                "\n" +
                "<p>8.1 Organizers will utilize \"Credit Card Processing\" or \"CCP\" via the Stripe Gateway when using the Services for the collection of Event Registration Fees. Monetary payments will be made to the Organizer directly by Test (via CCP) as described below. Your use of the Services shall be deemed to signify your acceptance of any applicable third party merchant services, payment processing or CCP providers (including without limitation all credit card networks, associations and issuers) applicable to the Services from time to time the applicable payment and/or CCP processing network rules, generally available at: (www.americanexpress.com, www.visa.com, www.mastercard.com, www.discover.com). You agree to comply with all federal, state and local laws, rules, regulations and ordinances and with all by-laws, regulations, rules and operating guidelines of such third party merchant services, payment processing or CCP providers (including without limitation all credit card networks, associations and issuers). You further agree to indemnify and hold Test and its affiliates harmless from any fines, fees, penalties, costs, expenses, damages, loss or liability incurred by Test as a result of the failure by you, or any person acting on your behalf, to comply with the foregoing obligations.</p>\n" +
                "\n" +
                "<p>8.2 Credit Card Processing.</p>\n" +
                "\n" +
                "<p>(a) Stripe Gateway; Payment Process. When an Organizer uses the Merchant Gateway for the collection of Event Registration Fees, payment processing occtest directly through Test. Test will collect all Event Registration Fees on behalf of the Organizer from Buyers and deduct all applicable Test Service Fees and Credit Card Processing Fees, and all additional on-site service fees, equipment lease charges and any other fees and charges of any kind payable by you to Test in connection with the provision of the Services (collectively, \"Service Fees\"), from the Event Registration Fees collected by Test, and then pass the remainder along to the Organizer ptestuant to the payout options the Organizer selects and is qualified to receive, but no less than within five (5) business days after the event end date for the event to which the Event Registration Fees correspond, to the address or account, respectively, that the Organizer accurately designates on the Site, provided that Test reserves the right to withhold funds (i) at any time as Test determines to be necessary for the processing and settlement of all refunds, disputed charges, chargebacks, customer complaints, allegations of fraud, and other discrepancies and (ii) as otherwise permitted ptestuant to these Terms. Test, in its sole discretion, may determine to advance a portion of Event Registration Fees to Organizer prior to the period set forth above, on such terms and conditions as Test may establish from time to time. Organizer agrees that all Event Registration Fees for a given event are earned by Organizer only following conclusion of the applicable event and all Event Registration Fees ultimately due will be net of all Service Fees, refunds, disputed charges, chargebacks and other deductions, whether due to customer complaints, allegations of fraud, discrepancies related to the applicable event or otherwise. No payments shall be made to an Organizer from Test with respect to any event that is cancelled. If payments have already been made by Test to an Organizer for a cancelled event, such Organizer will immediately refund to Test all such payments upon cancellation of such event. All sales, fees, charges, and funds are payable in test. Dollars, or other foreign currencies accepted by Test. If Organizer elects to list Event Registration Fees in a foreign currency accepted by Test, Test will collect and disperse the funds in the foreign currency selected by Organizer.</p>\n" +
                "\n" +
                "<p>ORGANIZER AGREES THAT ANY PAYMENT BY Test OF EVENT REGISTRATION FEES PRIOR TO THE FIFTH (5TH) BUSINESS DAY AFTER THE END DATE OF THE APPLICABLE EVENT ARE MERELY ADVANCES OF AMOUNTS THAT MAY BECOME DUE TO ORGANIZER UNDER THIS TOS AND THAT Test MAY DEMAND SUCH ADVANCES BACK (FROM TIME TO TIME IN ITS SOLE DISCRETION), AND ORGANIZER SHALL THEREUPON PROMPTLY (AND IN ANY CASE WITHIN FIVE (5) BUSINESS DAYS AFTER SUCH DEMAND) PAY BACK TO Test SUCH ADVANCE OR ANY PORTION THEREOF DEMANDED BY Test.</p>\n" +
                "\n" +
                "<p>(b) Refunds. It is the responsibility of the Organizer to communicate its refund policy to Buyers and to issue refunds to Buyers via the Services. An Organizer shall ensure that its refund policy is consistent with the terms of these Terms and the payment and refund mechanics of the Site. The Site permits an Organizer to issue refunds to Buyers, provided the refund is issued by Organizer before ninety-six (96) hotest after the end date of an event and within six (6) months after the transaction date for the underlying ticket/registration purchase. Refunds issued following such period will not be processed through the Site, unless otherwise agreed to by Test in its sole discretion. Subject to the foregoing, refunds issued by an Organizer will be processed within thirty (30) days after Organizer instructs the issuance of the refunds via the Site. All communications or disputes regarding refunds are between the Organizer and Buyer, and Test will not be responsible or liable for, and Organizer hereby agrees to fully indemnify Test and its affiliates for, refunds, errors in issuing refunds, or lack of refunds in connection with the use of CCP. (ii) Notwithstanding the foregoing, you acknowledge and agree that Test shall have the right to force a refund of any or all tickets/registrations at any time for any reason or no reason, including without limitation if Test receives complaints from a stesttantial number (as determined by Test in its sole discretion) of Buyers with respect to the applicable event or another event held by Organizer, or Test determines in its sole discretion that Organizer has engaged in any fraudulent activity or made any misrepresentations. Further, if one or more Buyer(s) reqtestt a refund, whether due to a cancelled event or for any other reason where Test would reasonably expect to lose a chargeback, Test may, in its sole discretion, issue such refund to such Buyer(s), and Organizer shall then owe the amount of such refund to Test.</p>\n" +
                "\n" +
                "<p>(c) Credit Card Chargebacks. When you receive a payment, you are liable to Test for the full amount of the payment, plus any fees, if the payment is later invalidated for any reason. This means that you will be responsible for reimbtesting Test if you lose a claim or a chargeback or if there is a reversal of the payment. Any credit card chargebacks initiated by a Buyer for any reason with respect to an event shall be charged back, including any and all applicable fees charged ptestuant to the CCP, to the Organizer of such event. All communications and disputes regarding chargebacks are between the Organizer and Buyer, and Test will not be responsible or liable in any way for, and Organizer hereby agrees to fully indemnify Test and its affiliates for, chargebacks issued in the coteste of the use of the CCP.</p>\n" +
                "\n" +
                "<p>8.3 Non-Exclusive Remedies.</p>\n" +
                "\n" +
                "<p>(a) In the event that Organizer fails to pay to Test any amount owed ptestuant to these Terms when due, such amount shall bear interest calculated from the date due until paid in full at a rate equal to the lesser of (a) eighteen percent (18%) per annum, and (b) the maximum amount permitted by applicable law. In the event any amounts are owed by Organizer to Test under these Terms or otherwise, Test may, without limiting its other rights and remedies, (i) deduct such amounts from Organizer's otesttanding balance, whether for that particular event or for any other event that Organizer lists through the Services; and/or (ii) send an invoice to Organizer for such amounts to the extent Organizer's otesttanding balance is insufficient to cover these costs, in which case Organizer shall pay Test such invoiced amounts within thirty (30) days after the date of the invoice. If payment for any amounts due to Test hereunder are not made by Organizer when due, Test reserves the right, in its sole discretion and without limiting its other rights and remedies, to terminate Organizer's registration for the Services (including any and all accounts that Organizer may have) and to cancel all other events listed by Organizer.</p>\n" +
                "\n" +
                "<p>(b) Upon receipt of a credit card authorization from each individual event registration, Test generates a confirmation message and isstest a unique confirmation number. You agree to unconditionally accept, honor, and fulfill all event commitments that have been confirmed by Test through the Services, and it is your responsibility to verify the Buyer's membership status, confirmation number and/or any event restrictions prior to the subject event.</p>\n" +
                "\n" +
                "<p>(c) Taxes; Withholding.</p>\n" +
                "\n" +
                "<p>(i) You are solely responsible for determining which, if any, sales, use, amusement, value added, consumption, excise and other taxes, duties, levies and charges (collectively, \"Taxes\") apply to your use of the Services and for collecting, remitting and reporting the correct amounts of all such Taxes to the applicable governmental authorities, even if Test provides you with tools that assist you in doing so. Test does not represent or warrant that any tax tools will meet all tax requirements that may be applicable to you. Test cannot give you legal or tax advice, so please be sure to check with your own tax advisor about any applicable Taxes. In the event that a governmental authority requires Test to pay any Taxes attributable to your use of the Services, you agree to indemnify and reimbteste Test for such Taxes and all costs and expenses related thereto.</p>\n" +
                "\n" +
                "<p>(ii) All Service Fees charged by Test do not include any Taxes except to the extent that a Tax is expressly set forth in the applicable invoice or billing statement, and you agree to pay any Taxes that are imposed and payable on such Service Fees (other than those calculated based on Test'S net income) to Test.</p>\n" +
                "\n" +
                "<p>(iii) In addition, due to new IRS regulations, if Test processes transactions and isstest you payotest (A) for more than $20,000 in gross sales and (B) for more than 200 order transactions, in each case during a given calendar year and in the aggregate across all of your accounts, Test is required to report to the IRS the gross amount of transactions for which you have been paid in that calendar year and in each month of that calendar year, as well as, your name, your address, and your Tax Identification Number (\"Your Tax Information\"). Starting in 2013, as part of these new IRS regulations, Test is required to either (I) collect Your Tax Information or (II) establish that you are a foreign person not subject to US taxes, before your accounts pass the 200 order transaction threshold in the aggregate. Once your accounts cross the 200 order transaction threshold, you agree that you will not receive any further payments from Test until either (I) or (II) above are satisfied. To learn more about these new IRS regulations and why we are required to do this, see the IRS 1099-K FAQ. <a href=\"http://www.irs.gov/uac/General-FAQs-on-New-Payment-Card-Reporting-Requirements\">http://www.irs.gov/uac/General-FAQs-on-New-Payment-Card-Reporting-Requirements</a></p>\n" +
                "\n" +
                "<p>(iv) Test reserves the right to withhold the payment of any amounts owed to you hereunder if Test suspects or determines that such amounts have been generated in (A) a fraudulent manner, (B) violation of these Terms, or (C) violation of any applicable laws or regulations (foreign or domestic), or if Test is required to do so by applicable laws or regulations (foreign or domestic). Such withholding may be temporary or permanent (as determined by Test).</p>\n" +
                "\n" +
                "<p><b>9. Ticket Registration Obligations</b></p>\n" +
                "\n" +
                "<p>9.1 To be a registered user of the Services as an Organizer you agree to: (a) provide true, accurate, current and complete information about yotestelf as prompted by the Site registration form (the \"Registration Data\") and (b) maintain and promptly update the Registration Data to keep it true, accurate, current and complete. If you provide any information that is untrue, inaccurate, not current or incomplete, or Test has reasonable grounds to suspect that such information is untrue, inaccurate, not current or incomplete, Test has the right to suspend or terminate all of your accounts and refuse any and all of your current or future use of the Services (or any portion thereof). Test is concerned about the safety and privacy of all its users, particularly children. For this reason, and to be consistent with the terms of use of any third party service provider, you must be at least 18 years of age, or the legal age of majority where you reside if that jurisdiction has an older age of majority, to register for an account.</p>\n" +
                "\n" +
                "<p><b>10.</b> <b>Content in the Services</b></p>\n" +
                "\n" +
                "<p>10.1 You understand that all information (such as data files, written text, computer software, music, audio files or other sounds, photographs, videos or other images) which you may have access to as part of, or through your use of, the Services are the sole responsibility of the person from which such content originated. All such information is referred to below as the \"Content\".</p>\n" +
                "\n" +
                "<p>10.2 Yotesthould be aware that Content presented to you as part of the Services, including but not limited to advertisements in the Services and sponsored Content within the Services may be protected by intellectual property rights which are owned by the sponsors or advertisers who provide that Content to Test (or by other persons or companies on their behalf). You may not modify, rent, lease, loan, sell, distribute or create derivative works based on this Content (either in whole or in part) unless you have been specifically told that you may do so by Test or by the owners of that Content, in a separate agreement.</p>\n" +
                "\n" +
                "<p>10.3 Test reserves the right (but shall have no obligation) to pre-screen, review, flag, filter, modify, refuse or remove any or all Content from any Service. For some of the Services, Test may provide tools to filter out explicit sexual content. In addition, there are commercially available services and software to limit access to material that you may find objectionable.</p>\n" +
                "\n" +
                "<p>10.4 You may not use Test services for the purpose of spamming. What constitutes \"spamming\" will constantly change and evolve with the methods of the spammers. Factors that are considered while determining spamming is as follows but not limited to:</p>\n" +
                "\n" +
                "<p>(a) If you have followed and/or unfollowed large amounts of users in a short time period, particularly by automated means</p>\n" +
                "\n" +
                "<p>(b) If you repeatedly follow and unfollow people, whether to build followers or to garner more attention for your profile;</p>\n" +
                "\n" +
                "<p>(c) If your post or event creation consist mainly of links, and not personal updates;</p>\n" +
                "\n" +
                "<p>(d) If a large number of people are blocking you;</p>\n" +
                "\n" +
                "<p>(e) If a large number of spam complaints have been filed against you;</p>\n" +
                "\n" +
                "<p>(f) If you post duplicate content over multiple accounts or multiple duplicate updates on one account;</p>\n" +
                "\n" +
                "<p>(g) If yotestend large numbers of duplicate events or invites;</p>\n" +
                "\n" +
                "<p>(h) If yotestend large numbers of testolicited messages</p>\n" +
                "\n" +
                "<p>(i) If you add a large number of unrelated users to lists;</p>\n" +
                "\n" +
                "<p>(j) If you repeatedly create false or misleading content;</p>\n" +
                "\n" +
                "<p>(k) Randomly or aggressively following, fav-ing or recommending events;</p>\n" +
                "\n" +
                "<p>(l) If you post or use misleading links (e.g. affiliate links, links to malware/click jacking pages, etc.);</p>\n" +
                "\n" +
                "<p>(m) Creating misleading accounts or account interactions;</p>\n" +
                "\n" +
                "<p>(n) Selling or purchasing account interactions (such as selling or purchasing followers, favs, etc.);</p>\n" +
                "\n" +
                "<p>(o) Using or promoting third-party services or apps that claim to get you more followers</p>\n" +
                "\n" +
                "<p>10.5 You understand that by using the Services you may be exposed to Content that you may find offensive, indecent or objectionable and that, in this respect, you use the Services at your own risk.</p>\n" +
                "\n" +
                "<p>10.6 You agree that you are solely responsible for (and that Test has no responsibility to you or to any third party for) any Content that you create, transmit or display while using the Services and for the consequences of your actions (including any loss or damage which Test may suffer) by doing so.</p>\n" +
                "\n" +
                "<p>10.7 It is Test's policy to respond to content flags once five notifications are placed on one piece of content or brand by a system administrator, within 48 hotest. Certain content due to its nature can and will be removed immediately and is done so at the discretion of the administrator.</p>\n" +
                "\n" +
                "<p>(a) If content is appropriate and administrator does not find reason to delete content, administrator removes all flags previously placed on content and sends internal message to content creator notifying user of flags placed on content and removal of flags. Message will instruct user to please contact system administrator through Help Center with qtesttions or if problem persists.</p>\n" +
                "\n" +
                "<p>(b) If content is inappropriate and does not adhere to Test's terms and conditions or administrator finds reason to delete content, the administrator will delete the content and send an internal message to the content creator notifying the user of flags placed on content and its removal.</p>\n" +
                "\n" +
                "<p>(c) If any piece of content is flagged in a specific account, that account is suggest to suspension or termination due to the violation of these terms. An email message will be sent to the user notifying of the action taking on the account and with an explanation of the reason.</p>\n" +
                "\n" +
                "<p>10.8 If you choose, you may share Content on certain of your SNS Accounts, via text messaging, and via email, through the social sharing functionality we've implemented through the Services. In doing so you must comply with the Terms of Conditions of the third party sites and applications.</p>\n" +
                "\n" +
                "<p><b>11. Proprietary rights</b></p>\n" +
                "\n" +
                "<p>11.1 You acknowledge and agree that Test (or Test's licensors) own all legal right, title and interest in and to the Services, including any intellectual property rights which stestist in the Services (whether those rights happen to be registered or not, and wherever in the world those rights may exist). You further acknowledge that the Services may contain information which is designated confidential by Test and that yotesthall not disclose such information without Test's prior written consent.</p>\n" +
                "\n" +
                "<p>11.2 Unless you have agreed otherwise in writing with Test, nothing in the Terms gives you a right to use any of Test's trade names, trade marks, service marks, logos, domain names, and other distinctive brand features.</p>\n" +
                "\n" +
                "<p>11.3 If you have been given an explicit right to use any of these brand features in a separate written agreement with Test, then you agree that your use of such features shall be in compliance with that agreement, any applicable provisions of the Terms, and Test's brand feature use guidelines as updated from time to time.</p>\n" +
                "\n" +
                "<p>11.4 Other than the limited license set forth in Section 11, Test acknowledges and agrees that it obtains no right, title or interest from you (or your licensors) under these Terms in or to any Content that yotestubmit, post, transmit or display on, or through, the Services, including any intellectual property rights which stestist in that Content (whether those rights happen to be registered or not, and wherever in the world those rights may exist). Unless you have agreed otherwise in writing with Test, you agree that you are responsible for protecting and enforcing those rights and that Test has no obligation to do so on your behalf.</p>\n" +
                "\n" +
                "<p>11.5 You agree that yotesthall not remove, obscure, or alter any proprietary rights notices (including copyright and trade mark notices) which may be affixed to or contained within the Services.</p>\n" +
                "\n" +
                "<p>11.6 Unless you have been expressly authorized to do so in writing by Test, you agree that in using the Services, you will not use any trade mark, service mark, trade name, logo of any company or organization in a way that is likely or intended to cause confusion about the owner or authorized user of such marks, names or logos.</p>\n" +
                "\n" +
                "<p>11.7 It is Test's policy to respond to notices of alleged copyright infringement that comply with applicable international intellectual property law (including, in the United States, the Digital Millennium Copyright Act) and to terminating the accounts of repeat infringers.</p>\n" +
                "\n" +
                "<p>11.8 It is Test's policy to respond to notices of a trade mark complaint with respect of Test's advertising business.</p>\n" +
                "\n" +
                "<p><b>12. License from Test</b></p>\n" +
                "\n" +
                "<p>12.1 Test gives you a personal, worldwide, royalty-free, non-assignable and non-exclusive license to use the software provided to you by Test as part of the Services as provided to you by Test (referred to as the \"Software\" below). This license is for the sole purpose of enabling you to use and enjoy the benefit of the Services as provided by Test, in the manner permitted by the Terms.</p>\n" +
                "\n" +
                "<p>12.2 You may not (and you may not permit anyone else to) copy, modify, create a derivative work of, reverse engineer, decompile or otherwise attempt to extract the source code of the Software or any part thereof, unless this is expressly permitted or required by law, or unless you have been specifically told that you may do so by Test, in writing.</p>\n" +
                "\n" +
                "<p>12.3 Unless Test has given yotestpecific written permission to do so, you may not assign (or grant a sub-license of) your rights to use the Software, grant a security interest in or over your rights to use the Software, or otherwise transfer any part of your rights to use the Software.</p>\n" +
                "\n" +
                "<p><b>13. Content license from you</b></p>\n" +
                "\n" +
                "<p>13.1 You retain copyright and any other rights you already hold in Content which yotestubmit, post or display on or through, the Services. By submitting, posting or displaying the content you give Test a perpetual, irrevocable, worldwide, royalty-free, and non-exclusive license to reproduce, adapt, modify, translate, publish, publicly perform, publicly display and distribute any Content which yotestubmit, post or display on or through, the Services. This license is for the sole purpose of enabling Test to display, distribute and promote the Services and may be revoked for certain Services as defined in the Additional Terms of those Services.</p>\n" +
                "\n" +
                "<p>13.2 You agree that this license includes a right for Test to make such Content available to other companies, organizations or individuals with whom Test has relationships for the provision of syndicated services, and to use such Content in connection with the provision of those services.</p>\n" +
                "\n" +
                "<p>13.3 You understand that Test, in performing the required technical steps to provide the Services to our users, may (a) transmit or distribute your Content over various public networks and in various media; and (b) make such changes to your Content as are necessary to conform and adapt that Content to the technical requirements of connecting networks, devices, services or media. You agree that this license shall permit Test to take these actions.</p>\n" +
                "\n" +
                "<p>13.4 You confirm and warrant to Test that you have all the rights, power and authority necessary to grant the above license.</p>\n" +
                "\n" +
                "<p><b>14. Software updates</b></p>\n" +
                "\n" +
                "<p>14.1 The Software which you use may automatically download and install updates from time to time from Test. These updates are designed to improve, enhance and further develop the Services and may take the form of bug fixes, enhanced functions, new software modules and completely new versions. You agree to receive such updates (and permit Test to deliver these to you) as part of your use of the Services.</p>\n" +
                "\n" +
                "<p><b>15. Ending your relationship with Test</b></p>\n" +
                "\n" +
                "<p>15.1 The Terms will continue to apply until terminated by either you or Test as set out below.</p>\n" +
                "\n" +
                "<p>15.2 If you want to terminate your legal agreement with Test, you may do so by (a) notifying Test at any time and (b) closing your accounts for all of the Services which you use, where Test has made this option available to you. Your notice should be sent, in writing, to Test's address which is set out at the beginning of these Terms.</p>\n" +
                "\n" +
                "<p>15.3 Test may at any time, terminate its legal agreement with you if:</p>\n" +
                "\n" +
                "<p>(a) You have breached any provision of the Terms (or have acted in manner which clearly shows that you do not intend to, or are unable to comply with the provisions of the Terms); or</p>\n" +
                "\n" +
                "<p>(b) Test is required to do so by law (for example, where the provision of the Services to you is, or becomes, unlawful); or</p>\n" +
                "\n" +
                "<p>(c) The partner with whom Test offered the Services to you has terminated its relationship with Test or ceased to offer the Services to you; or</p>\n" +
                "\n" +
                "<p>(d) Test is transitioning to no longer providing the Services to users in the country in which you are resident or from which you use the Service; or</p>\n" +
                "\n" +
                "<p>(e) The provision of the Services to you by Test is, in Test's opinion, no longer commercially viable; or</p>\n" +
                "\n" +
                "<p>(f) For any reason deemed reasonable and/or necessary in Test's sole determination.</p>\n" +
                "\n" +
                "<p>15.4 Nothing in this Section shall affect Test's rights regarding provision of Services under Section 4 of the Terms.</p>\n" +
                "\n" +
                "<p>15.5 When these Terms come to an end, all of the legal rights, obligations and liabilities that you and Test have benefited from, been subject to (or which have accrued over time whilst the Terms have been in force) or which are expressed to continue indefinitely, shall be unaffected by this cessation, and the provisions of paragraph 22.7 shall continue to apply to such rights, obligations and liabilities indefinitely.</p>\n" +
                "\n" +
                "<p><b>16. Exclusion of warranties</b></p>\n" +
                "\n" +
                "<p>16.1 Nothing in these terms, including sections 14 and 15, shall exclude or limit Test's warranty or liability for losses which may not be lawfully excluded or limited by applicable law. Some jurisdictions do not allow the exclusion of certain warranties or conditions or the limitation or exclusion of liability for loss or damage caused by negligence, breach of contract or breach of implied terms, or incidental or consequential damages. Accordingly, only the limitations which are lawful in your jurisdiction will apply to you and our liability will be limited to the maximum extent permitted by law. We make no warranty that the Services will meet your requirements or be available on an uninterrupted, secure, or error-free basis or be compatible or interoperable with your mobile device or any other hardware, software or equipment installed on or used in connection with your mobile device. We make no warranty regarding the quality, accuracy, timeliness, truthfulness, completeness or reliability of any Content.</p>\n" +
                "\n" +
                "<p>16.2 You expressly understand and agree that your use of the services is at your sole risk and that the services are provided \"as is\" and \"as available.\"</p>\n" +
                "\n" +
                "<p>16.3 In particular, Test, its stestidiaries and affiliates, and its licensors do not represent or warrant to you that:</p>\n" +
                "\n" +
                "<p>(a) Your use of the services will meet your requirements,</p>\n" +
                "\n" +
                "<p>(b) Your use of the services will be uninterrupted, timely, secure or free from error,</p>\n" +
                "\n" +
                "<p>(c) Any information obtained by you as a result of your use of the services will be accurate or reliable, and</p>\n" +
                "\n" +
                "<p>(d) That defects in the operation or functionality of any software provided to you as part of the services will be corrected.</p>\n" +
                "\n" +
                "<p>16.4 Any material downloaded or otherwise obtained through the use of the services is done at your own discretion and risk and that you will be solely responsible for any damage to your computer system or other device or loss of data that results from the download of any such material.</p>\n" +
                "\n" +
                "<p>16.5 Test is neither an agent of nor is connected or affiliated with any event organizer or operator or venue or operator of any venue for any event included in the services or for which a user has purchased a ticket through the services. Test makes no warranty or representations of any kind regarding the performance or non – performance of any event venue or operator of any venue in connection with the service, including the failure to honor tickets or other reservations or the delivery of incorrect products and/or services.</p>\n" +
                "\n" +
                "<p>16.6 No advice or information, whether oral or written, obtained by you from Test or through or from the services shall create any warranty not expressly stated in the terms.</p>\n" +
                "\n" +
                "<p>16.7 Test further expressly disclaims all warranties and conditions of any kind, whether express or implied, including, but not limited to the implied warranties and conditions of merchantability, fitness for a particular purpose and non-infringement.</p>\n" +
                "\n" +
                "<p>16.8 You assume all risks relating to your online or offline communications and interactions with other users of the services and with other persons with whom you communicate or interact as a result of your use of the services. You understand that Test does not screen or inquire into the background of any users of the services, nor does Test make any attempt to verify the statements of users of the services. Test makes no representations or warranties as to the conduct of users of the services. You agree to take reasonable precautions in all communications and interactions with other users of the services and with other persons with whom you communicate or interact as a result of your use of the services, particularly if you decide to meet offline or in person.</p>\n" +
                "\n" +
                "<p><b>17. Limitations of liability</b></p>\n" +
                "\n" +
                "<p>17.1 subject to overall provision in paragraph 14.1 above, you expressly understand and agree that Test, its stestidiaries and affiliates, and its licensors shall not be liable to you for:</p>\n" +
                "\n" +
                "<p>(a) Any direct, indirect, incidental, special consequential or exemplary damages which may be incurred by you, however caused and under any theory of liability.. this shall include, but not be limited to, any loss of profit (whether incurred directly or indirectly), any loss of goodwill or business reputation, any loss of data suffered, cost of procurement of stesttitute goods or services, or other intangible loss;</p>\n" +
                "\n" +
                "<p>(b) Any loss or damage which may be incurred by you, including but not limited to loss or damage as a result of:</p>\n" +
                "\n" +
                "<p>(i) Any reliance placed by you on the completeness, accuracy or existence of any advertising, or as a result of any relationship or transaction between you and any advertiser or sponsor whose advertising appears on the services;</p>\n" +
                "\n" +
                "<p>(ii) Any changes which Test may make to the services, or for any permanent or temporary cessation in the provision of the services (or any features within the services);</p>\n" +
                "\n" +
                "<p>(iii) The deletion of, corruption of, or failure to store, any content and other communications data maintained or transmitted by or through your use of the services;</p>\n" +
                "\n" +
                "<p>(iv) Your failure to provide Test with accurate account information;</p>\n" +
                "\n" +
                "<p>(v) Your failure to keep your password or account details secure and confidential;</p>\n" +
                "\n" +
                "<p>17.2 the limitations on Test's liability to you in paragraph 15.1 above shall apply whether or not Test has been advised of or should have been aware of the possibility of any such losses arising.</p>\n" +
                "\n" +
                "<p><b>18. Notification procedures</b></p>\n" +
                "\n" +
                "<p>18.1 Test may provide notifications, whether such notifications are required by law or are for marketing or other business related purposes, to you via email notice, mobile notification, written or hard copy notice, or through posting of such notice on our website, as determined by Test in our sole discretion. Test reserves the right to determine the form and means of providing notifications to you, provided that you may opt out of certain means of notification as described in these Terms of Service and our Privacy Policy. Test is not responsible for any automatic filtering you or your network provider may apply to email notifications we send to the email address you provide us.</p>\n" +
                "\n" +
                "<p><b>19. Advertisements</b></p>\n" +
                "\n" +
                "<p>19.1 Some of the Services are supported by advertising revenue and may display advertisements and promotions. These advertisements may be targeted to the content of information stored on the Services, queries made through the Services or other information.</p>\n" +
                "\n" +
                "<p>19.2 The manner, mode and extent of advertising by Test on the Services are subject to change without specific notice to you.</p>\n" +
                "\n" +
                "<p>19.3 In consideration for Test granting you access to and use of the Services, you agree that Test may place such advertising on the Services.</p>\n" +
                "\n" +
                "<p><b>20. Other content</b></p>\n" +
                "\n" +
                "<p>20.1 The Services may include hyperlinks to other web sites or content or resources. Test may have no control over any web sites or resources which are provided by companies or persons other than Test.</p>\n" +
                "\n" +
                "<p>20.2 You acknowledge and agree that Test is not responsible for the availability of any such external sites or resources, and does not endorse any advertising, products or other materials on or available from such web sites or resources.</p>\n" +
                "\n" +
                "<p>20.3 You acknowledge and agree that Test is not liable for any loss or damage which may be incurred by you as a result of the availability of those external sites or resources, or as a result of any reliance placed by you on the completeness, accuracy or existence of any advertising, products or other materials on, or available from, such web sites or resources.</p>\n" +
                "\n" +
                "<p><b>21. Changes to the terms</b></p>\n" +
                "\n" +
                "<p>21.1 Test may make changes to the Universal Terms or Additional Terms from time to time. When these changes are made, Test will make a new copy of the Universal Terms available at <a href=\"http://about.Test.com/terms\">http://about.Test.com/terms</a> and any new Additional Terms will be made available to you from within, or through, the affected Services.</p>\n" +
                "\n" +
                "<p>21.2 You understand and agree that if you use the Services after the date on which the Universal Terms or Additional Terms have changed, Test will treat your use as acceptance of the updated Universal Terms or Additional Terms.</p>\n" +
                "\n" +
                "<p><b>22. General legal terms</b></p>\n" +
                "\n" +
                "<p>22.1 Sometimes when you use the Services, you may (as a result of, or through your use of the Services) use a service or download a piece of software, or purchase goods, which are provided by another person or company. Your use of these other services, software or goods may be subject to separate terms between you and the company or person concerned. If so, the Terms do not affect your legal relationship with these other companies or individuals.</p>\n" +
                "\n" +
                "<p>22.2 The Terms constitute the whole legal agreement between you and Test and govern your use of the Services (but excluding any services which Test may provide to you under a separate written agreement), and completely replace any prior agreements between you and Test in relation to the Services.</p>\n" +
                "\n" +
                "<p>22.3 You agree that Test may provide you with notices, including those regarding changes to the Terms, by email, regular mail, or postings on the Services.</p>\n" +
                "\n" +
                "<p>22.4 You agree that if Test does not exercise or enforce any legal right or remedy which is contained in the Terms (or which Test has the benefit of under any applicable law), this will not be taken to be a formal waiver of Test's rights and that those rights or remedies will still be available to Test.</p>\n" +
                "\n" +
                "<p>22.5 If any court of law, having the jurisdiction to decide on this matter, rules that any provision of these Terms is invalid, then that provision will be removed from the Terms without affecting the rest of the Terms. The remaining provisions of the Terms will continue to be valid and enforceable.</p>\n" +
                "\n" +
                "<p>22.6 You acknowledge and agree that each member of the group of companies of which Test is the parent shall be third party beneficiaries to the Terms and that such other companies shall be entitled to directly enforce, and rely upon, any provision of the Terms which confers a benefit on (or rights in favor of) them. Other than this, no other person or company shall be third party beneficiaries to the Terms.</p>\n" +
                "\n" +
                "<p>22.7 The Terms, and your relationship with Test under the Terms, shall be governed by the laws of the State of Florida without regard to its conflict of laws provisions. You and Test agree to submit to the exclusive jurisdiction of the courts located in Hillsborough County, Florida to resolve any legal matter arising from the Terms. Notwithstanding this, you agree that Test shall still be allowed to apply for injunctive remedies (or an equivalent type of urgent legal relief) in any jurisdiction.</p>\n" +
                "\n" +
                "<p>22.8 You agree to defend, indemnify, and hold harmless Test, its officers, directors, employees, and agents, from and against any claims, actions or demand, including, without limitation, reasonable attorneys' fees and accounting fees, alleging or resulting from your use of the Services provided by Test and/or your breach of this agreement. Test shall provide prompt notice you of any such claim, suit, or proceeding and Test shall assist you, at your expense, in defending any such claim, suit, and/or proceeding.</p>\n" +
                "\n" +
                "<p>22.9 If Test or you have to bring an action in court to enforce the Terms, or the subject matter of the Terms, the prevailing party shall be entitled to its attorneys' fees and costs. In addition, any money owed under this agreement shall accrue interest at the maximum allowable rate by law. Finally, in all actions concerning the Terms, or the subject matter of the Terms, each party specifically waives its right to a jury trial.</p>\n" +
                "\n" +
                "<p><b>23. Additional terms relating to apple</b></p>\n" +
                "\n" +
                "<p>If you download, access and/or use the App or Services on Apple's iOS operating system:</p>\n" +
                "\n" +
                "<p>23.1 The App may only be accessed and used on a device owned or controlled by you and using Apple's iOS operating system, and only in accordance with Apple's usage rules published in its App Store terms of service;</p>\n" +
                "\n" +
                "<p>23.2 You acknowledge and agree that:</p>\n" +
                "\n" +
                "<p>(a) Apple has no obligation at all to provide any support or maintenance services in relation to the App. If you have any maintenance or support qtesttions in relation to the App, please Contact Test, not Apple, using the details in these Terms;</p>\n" +
                "\n" +
                "<p>(b) Except as otherwise expressly set out in these Terms, any claims relating to the possession or use of the App are between you and Test (and not between you, or anyone else, and Apple);</p>\n" +
                "\n" +
                "<p>(c) In the event of any claim by a third party that your possession or use (in accordance with these Terms) of the App infringes any intellectual property rights, Apple will not be responsible or liable to you in relation to that claim; and</p>\n" +
                "\n" +
                "<p>(d) Although these Terms are entered into between you and us (and not Apple), Apple, as a third party beneficiary under these Terms, will have the right to enforce these Terms against you.</p>\n" +
                "\n" +
                "<p>23.3 You represent and warrant that:</p>\n" +
                "\n" +
                "<p>(a) You are not, and will not be, located in any country that is the subject of a United States Government embargo or that has been designated by the United States Government as a \"terrorist supporting\" country; and</p>\n" +
                "\n" +
                "<p>(b) You are not listed on any United States Government list of prohibited or restricted parties; and</p>\n" +
                "\n" +
                "<p>23.4 If the App does not conform to any warranty applying to it, you may notify Apple, which will then refund the purchase price of the App (if any), to you. Subject to that, and to the maximum extent permitted by law, Apple does not give or enter into any warranty, condition or other term in relation to the App and will not be liable to you for any claims, losses, costs or expenses of whatever nature in relation to the App or as a result of you or anyone else using the App or relying on any of its content.</p>\n" +
                "\n" +
                "<p><b>24. Brand Ambassador Terms and Conditions</b></p>\n" +
                "\n" +
                "<p><u>Non-Disclosure</u>. The Company and the Recipient agree that there is certain confidential information and proprietary information (\"proprietary information\") of the Company that the Recipient may learn and/or be exposed to during the Recipient's relationship with the Company. Towards that end, the Company and the Recipient agree to the following:</p>\n" +
                "\n" +
                "<p>The Recipient will not, without the Company's written permission, disclose to anyone otestide of the Company or use for the Recipient's own benefit or the benefit of others, any of the Company's proprietary information or proprietary information of others to which the Recipient has had access to in the coteste of their relationship with the Company. \"Proprietary information\" includes any technical, business, financial, human resource, or marketing information or material pertaining to or used in the operations of the Company or its stestidiaries and affiliates, or similar information of others to which the Recipient has had access during their relationship with the Company, that has not been made available to the general public by the Company or by such other entities, respectively.</p>\n" +
                "\n" +
                "<p>The Recipient understands that their obligations not to disclose or use proprietary information remains in effect after the termination of the relationship between the Recipient and the Company and that if, at any time in the future, the Recipient wishes to disclose or use any such proprietary information or if the Recipient should be in doubt as to whether any information may be proprietary to the Company, the Recipient will, prior to such disclosure or use, obtain written permission from the Company to do so. The Recipient further understands that such permission may be refused by the Company at its discretion.</p>\n" +
                "\n" +
                "<p>The Recipient certifies that all of the Company's property, including all proprietary information and material such as drawings, notebooks, reports, computer software, and other documents, will be immediately returned to the Company upon the Company's reqtestt.</p>\n" +
                "\n" +
                "<p><u>Remedies</u>. The Recipient acknowledges and agrees that the restrictions set forth in paragraph 1 above hereof are reasonable and necessary for the protection of the Company's business and goodwill, including its proprietary information. The Recipient further agrees that if the Recipient breaches or threatens to breach any of the Recipient's obligations under paragraph 1 above, the Company will suffer irreparable harm and monetary damages may be insufficient to remedy such a breach. Therefore, the Company, in addition to any other remedies available to it under the law, may obtain specific performance and/or injunctive relief against the Recipient to prevent such continued or threatened breach.</p>\n" +
                "\n" +
                "<p><u>Miscellaneous</u>. The following general provisions also apply to this agreement:</p>\n" +
                "\n" +
                "<p>The invalidity or unenforceability of any provision of this agreement shall not affect, impair, or render unenforceable any other provisions hereof. It is intended that any provision herein that is stestequently held to be invalid or unenforceable as written be construed as valid and enforceable to the fullest extent possible. Furthermore, if a court of competent jurisdiction finds that any restrictions in paragraph 1 above are unenforceable by reason of its business scope or duration, such provision shall be construed as if such scope or duration had been more narrowly drafted so as not to be invalid or unenforceable.</p>\n" +
                "\n" +
                "<p>This agreement may be modified only in writing by an agreement signed by both parties. Furthermore, any failure by either party to enforce the other party's strict performance of any provision of this agreement will not constitute a waiver of its right to stestequently enforce such provision or any other provision of this agreement.</p>\n" +
                "\n" +
                "<p>If either party has to bring an action to enforce this agreement, or the subject matter of this agreement, the prevailing party shall be entitled to its attorneys' fees and costs.</p>\n" +
                "\n" +
                "<p>This agreement shall be binding upon the parties, their successors, and assignees. Furthermore, neither party shall assign this agreement, nor any of the proprietary information received under this agreement, without the other party's prior written consent. Finally, any provision which, by its nature, is intended to survive or which the parties have agreed should survive, will survive the completion, expiration, termination, and/or cancellation of this agreement. </p>\n" +
                "\n" +
                "<p>The law of the state of Florida will govern the terms of this agreement. Furthermore, proper venue for any action involving this agreement, or the subject matter of this agreement, shall be in Hillsborough County, Florida.</p>\n" +
                "\n" +
                "<p>For purposes of this Agreement, \"Work Product\" shall mean all intellectual property rights, including all trade secrets, test. and international copyrights, patentable inventions, and other intellectual property rights in any programming, documentation, technology or other work product that is created in connection with my Work. In addition, all rights in any preexisting programming, documentation, technology or other work product provided to Owner during the coteste of my employment or engagement shall automatically become part of the \"Work Product\" hereunder, whether or not it arises specifically out of \"Work.\" \"Work\" shall mean (i) any direct assignments and required performance by or for Owner, and (ii) any other productive output that relates to the business of Owner and is produced during the coteste of my employment or engagement by Owner. For this purpose, \"Work\" may be considered present even after normal working hotest, away from Owner's premises, on an testupervised basis, alone or with others. Unless otherwise provided in a stestequent writing signed by Owner, this Agreement shall apply to all Work Product created in connection with all Work conducted before or after the date of this Agreement.</p>\n" +
                "\n" +
                "<p>Owner shall own all rights in the Work Product. To this end, all Work Product shall be considered work made by me for hire for Owner. If any of the Work Product may not, by operation of law or agreement, be considered work made by me for hire for Owner (or if ownership of all rights therein do not otherwise vest exclusively in Owner), I agree to assign, and upon creation thereof automatically assign, without further consideration, the ownership thereof to Owner. I hereby irrevocably relinqtesth for the benefit of Owner and its assigns any moral rights in the Work Product recognized by applicable law. Owner shall have the right to obtain and hold, in whatever name or capacity it selects, copyrights, registrations, and any other protection available in the Work Product.</p>\n" +
                "\n" +
                "<p>I agree to perform upon the reqtestt of Owner, during or after my Work, such further acts as may be necessary or desirable to transfer, perfect and defend Owner's ownership of the Work Product, including by (i) executing, acknowledging and delivering any reqtestted affidavits and documents of assignment and conveyance, (ii) obtaining and/or aiding in the enforcement of copyrights, trade secrets, and (if applicable) patents with respect to the Work Product in any countries, and (iii) providing testimony in connection with any proceeding affecting the rights of Owner in any Work Product.</p>\n" +
                "\n" +
                "<p>During the coteste of my employment or engagement and afterwards, I agree not to use or disclose any trade secrets of Owner at any time except as necessary to perform my duties for Owner. Under the law, a \"trade secret\" is a type of intangible property, the theft (i.e., misappropriation) of which is a tort and crime in most states. It does not have to be in written form to be protected. A trade secret generally consists of valuable, secret information or ideas that Owner collects or uses in order to keep its competitive edge (including confidential information supplied to Owner by its customers, clients, vendors or agents). Examples of trade secrets are such technical information as manufacturing or operating processes, equipment design, product specifications, computer software in source code form, and other proprietary technology, and such business information as selling and pricing information and procedures, customer lists, business and marketing plans, and internal financial statements.</p>\n" +
                "\n" +
                "<p>These restrictions do not apply to any information generally available to the public or any information properly obtained from a completely independent source. </p>\n" +
                "\n" +
                "<p>I warrant that my Work for Owner does not and will not in any way conflict with any remaining obligations I may have with any prior employer or contractor. I also agree to develop all Work Product in a manner that avoids even the appearance of infringement of any third party's intellectual property rights.</p>\n" +
                "\n" +
                "<p>Upon the reqtestt of Owner and, in any event, upon the termination of my Work, I will leave with Owner all memoranda, notes, records, drawings, manuals, disks or other documents, equipment and media pertaining to Owner's business or my Work or containing any Work Product (including all copies thereof). I agree to certify in writing, upon Owner's reqtestt, that such action has been completed.</p>\n" +
                "\n" +
                "<p>This Agreement does not supersede or modify any other agreement or other obligation concerning any other consistent aspect of the terms of my Work. This Agreement may not be modified or waived except ptestuant to a written instrument signed by Owner.</p>\n" +
                "\n" +
                "<p>This Agreement shall be governed by Florida law.</p>\n";


        textView.setText(Html.fromHtml(terms_and_condition));
    }
}
