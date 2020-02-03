        $(function() {

            $("#jsGrid").jsGrid({
                height: "100%",
                width: "100%",
                filtering: false,
                editing: true,
                sorting: true,
                paging: true,
                autoload: true,
                pageSize: 15,
                pageButtonCount: 5,
                deleteConfirm: "你确定要删除这条员工信息吗？",
                controller: {
                	loadData: function(filter){
                	      return $.ajax({
                	          type: "get",
                	          url: "/PersonManagement/adminSalary/allEmpSalary",
                	          data: filter
                	      });
                	  },
                	  updateItem: function(item) {
                          var d = $.Deferred();
                          item._method = "PUT";
                          delete item.eId;
                          return $.ajax({
                              type: "POST",
                              url: "/PersonManagement/adminSalary/updateEmpSalary",
                              data: item,
                              dataType: "json"
                          }).done(function(response) {
                              d.resolve(response);
                              alert(response.msg);
                              grid.loadData();
                          }).fail(function() {
                              grid.loadData();
                              d.resolve(previousItem);
                          });
                      }
                },
                onItemInserting: function(args) {
                    previousItem = args.previousItem;
                    grid = args.grid;
                },

                onItemUpdating: function(args) {
                    previousItem = args.previousItem;
                    grid = args.grid;
                },

                onItemDeleting: function(args) {
                    previousItem = args.previousItem;
                    grid = args.grid;
                },
                fields: [
                    { name: "eId.eId",title:"员工编号", type: "text", width: 50,sorting:true,readOnly:true },
                    { name: "eId.eName",title:"员工姓名", type: "text", width: 70,readOnly:true,readOnly:true },
                    { name: "sSalary",title:"基本工资", type: "text", width: 70,sorting:true},
                    { name: "sSocial",title:"社保工资", type: "text", width: 70,sorting:true },
                    { name: "sSubsidy",title:"社保金额", type: "text", width: 70,sorting:true},
                    { name: "sFinal",title:"实际工资", type: "text", width: 70,sorting:true,editing:true },
//                  { name: "Country", type: "select", items: db.countries, valueField: "Id", textField: "Name" },
//                  { name: "Married", type: "checkbox", title: "Is Married", sorting: false },
                    {type: "control",deleteButton:false,editButton:true,editing:true}
                    
                ]
            });

        });
