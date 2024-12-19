Model & Repository:

Organization

Event

Feedback

Report

BanList

DTO:

EventDTO- FeedbackDTO-FeedbackODTO- OrganizationIDTO-

OrganizationODTO – ReportODTO –ReportIDTO 

Service:

CertificateService:

1/getAll

2/addCertificate

3/updateCertificate

4/deleteExpiredCertificate

5/convertCertificateToDTo

ContributorService:

1/report

2/getReportsSentByContributor

EventService:

1/delete

2/addArtifactToEvent

3/updateArtifactAvailability

4/convertEventToDTO

FeedbackService:

1/createFeedback

2/updateFeedback

3/findFeedbackByOrganizationId

4/convertFeedBackToODTo

OrganizationService:

1/getAllOrganizations

2/add

3/update

4/delete

5/convertOrganizationToDTo

6/updateRequest

7/deleteRequest

8/report

9/getReportsSentByOrganization

ReportService:

1/createReport

2/convertReportToDTo

RequestService:

1/requestBorrowArtifact

ResearcherService:

1/getRecommendation

2/report

3/getReportsSentByResearcher

Controller :

"I have implemented all the functionalities in the service layer and created corresponding endpoints for each of them in the controller layer to ensure full integration and accessibility of the features."

Extra Endpoints:

1/ Organization > report

2/ Organization > getReportsSentByOrganization

3/Event > addArtifactToEvent

4/ Event> updateArtifactAvailability

task updates the availability of artifacts linked to events once the event has ended.

5/ Feedback >createFeedback

6/Feedback >findFeedbackByOrganizationId

7/Feedback > convertFeedBackToODTo

8/ Request > requestBorrowArtifact

9/ Researcher> getRecommendation

10/ Researcher > report

11/ Researcher > getReportsSentByResearcher

12/ Contributor > report

13/ Contributor >   getReportsSentByContributor

14/ Certificate > deleteExpiredCertificate 

task runs daily at midnight to automatically delete expired
certificates from the system.

15/ getBanList

