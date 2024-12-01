![Diagram](https://planttext.com/api/plantuml/png/h5PBRjim4Dth58GtbG7h0e5hk7PI58NT5h7HPij84vieHH8SggYHzcHTz4YzGadzVxGJm5u89cVUcyT7SgH_V_ukqL1jifG7mHjo2qzC05bHyNslgK0Q6oO5YJb53FBd8FOS4FkBo4R6bDzI0oInZt8oaTaZ1q9JcGbJpksCPk904i1OC-KuyW3fCuTTnbcNR3R2Cos93c0SB9pUDAgQqBiSxu85OGlKKBbmKQ0C6raCMu7VViU-Q1a3ejJdh6kIQWyPcdalQq5CCy1ngsgcy393PPBr9SwuTMOl3UKUKzh0jSjOdRPIcADBt58rBvoOMPl5OL4xfUv-AX08639XY73RC2Qhp4ybcftDDsihvY3roMFnFM36ZQMMsa3Ns5xekMI6V68lF-otcnSuKnyfcHcLcVUCWrNoGxAaesDjKoM7KI7zM5T9eQ4eiY0w5urZ9TfRIpLQ8ciaw2SQGr3_6ycgoYat3ClLCD4iPdmVEglRVIt9YXM5B5KSKhizE2muhPPTWwwWuEFkywVNIsYXhg3XORjvlOG6T0K5hO1B_gQfKht3vacfYYyVKdvNY0u5JO6y9PFMSPzKZM3yOjXss1fZEFMfsm7LyT4lhOvNkZ2VM9to5lsIMzbz3vntxnviItEm8rCOU1jk52q6Bx8RCebjRwDCuEGyijTkB32ppUu2Q7XRQzmmDFyLHSsjyYKqPzwNKH_9m7DOBXenjfCUKB6OO0aYSPyJ_m400F__0m00)
# Giải thích về các lớp và mối quan hệ:
## BankTransaction:
  - Lớp này đại diện cho một giao dịch ngân hàng, chứa các thuộc tính như date (ngày giao dịch), amount (số tiền), và description (mô tả của giao dịch).
  - Các phương thức của lớp này bao gồm các getter và toString() để hiển thị giao dịch.
## BankTransactionProcessor:
  - Lớp này xử lý các giao dịch ngân hàng và cung cấp các phương thức như calculateTotalAmount(), transactionsCountByMonth(), topExpenses(), và mostSpentCategory() để tính toán và phân tích các giao dịch.
## ResultExporter:
  - Lớp này chịu trách nhiệm xuất kết quả phân tích ra file HTML.
## ConsoleExporter:
  - Lớp này có thể in các kết quả phân tích ra console.
## TransactionParser:
  - Đây là một giao diện cha cho các lớp parser cụ thể (CSVParser, JSONParser, XMLParser). Nó định nghĩa phương thức parse() để phân tích dữ liệu từ các file khác nhau.
## CSVParser, JSONParser, XMLParser:
  - Các lớp này triển khai giao diện TransactionParser và cung cấp cách phân tích dữ liệu từ các định dạng CSV, JSON, và XML.
## TransactionListWrapper:
  - Lớp này sử dụng JAXB để đánh dấu danh sách các giao dịch (BankTransaction) trong XML. Nó có thể chứa một hoặc nhiều đối tượng BankTransaction.
## TransactionSearcher:
  - Lớp này cung cấp các phương thức để tìm kiếm giao dịch ngân hàng, ví dụ như tìm giao dịch theo ngày cụ thể.
