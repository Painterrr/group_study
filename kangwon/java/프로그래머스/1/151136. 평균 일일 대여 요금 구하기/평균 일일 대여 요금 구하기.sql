Select ROUND(AVG(daily_fee)) AVARAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
GROUP BY CAR_TYPE
HAVING CAR_TYPE = 'SUV';

# SELECT ROUND(SUM(daily_fee) / COUNT(car_id)) AVERAGE_FEE
# FROM CAR_RENTAL_COMPANY_CAR
# WHERE car_type = "SUV";

# SELECT *
# FROM CAR_RENTAL_COMPANY_CAR;